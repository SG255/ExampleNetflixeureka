package com.example.course.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.model.Course;
import com.example.course.service.CourseRepository;



@RestController
@RequestMapping("/courseDetils")
public class CourseDetailsController {
	@Autowired
	private CourseRepository service;
	
    @GetMapping("/course/{id}")
	public Course getCourseDetails(@PathVariable("id") int id) {
    	     
    	 Optional<Course> courseDtls=service.findById(id);
    	 return courseDtls.get();
	}
    
    @PostMapping("/save")
	public Course saveStudentDetails(@RequestBody Course course) {
    	     
    	Course crse=service.save(course);
    	 return crse;
	}
    @PostMapping("/saveAll")
	public List<Course> saveAllStudentDetails(@RequestBody List<Course> course) {
    	     
    	 List<Course> crse=service.saveAll(course);
    	 return crse;
	}
    
    @GetMapping("/getAll")
	public List<Course> getCourseDetails() {
    	     
    	 List<Course> crseDtls=service.findAll();
    	 return crseDtls;
	}
}
