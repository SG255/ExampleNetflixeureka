package com.example.student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.model.Student;
import com.example.student.service.StudentDetailsService;

@RestController
@RequestMapping("/studentDetails")
public class StudetntDeatilsController {
	@Autowired
	private StudentDetailsService service;
    @GetMapping("/student/{id}")
	public Student getStudentDetails(@PathVariable("id") int id) {
    	     
    	 Optional<Student> studentDtls=service.findById(id);
    	 return studentDtls.get();
	}
    
    @PostMapping("/save")
	public Student saveStudentDetails(@RequestBody Student student) {
    	     
    	 Student studnt=service.save(student);
    	 return studnt;
	}
    @PostMapping("/saveAll")
	public List<Student> saveAllStudentDetails(@RequestBody List<Student> student) {
    	     
    	 List<Student> studnt=service.saveAll(student);
    	 return studnt;
	}
    
    @GetMapping("/getAll")
	public List<Student> getStudentDetails() {
    	     
    	 List<Student> studentDtls=service.findAll();
    	 return studentDtls;
	}
    
}
