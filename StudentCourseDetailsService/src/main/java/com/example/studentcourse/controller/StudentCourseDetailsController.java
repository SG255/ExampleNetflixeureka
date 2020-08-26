package com.example.studentcourse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.studentcourse.model.Course;
import com.example.studentcourse.model.Student;
import com.example.studentcourse.model.StudentCourse;

@RestController
@RequestMapping("/studentcourseDetails")
public class StudentCourseDetailsController {
	@Autowired
    private RestTemplate restTemplate;

    @Autowired
    WebClient.Builder webClientBuilder;

    @RequestMapping("/{studentId}")
    public StudentCourse getCatalog(@PathVariable("studentId") String studentId) {

      Student student = restTemplate.getForObject("http://student-details-service/studentDetails/student/" + studentId, Student.class);
      int courseId=16;
      Course course = restTemplate.getForObject("http://course-details-service/courseDetils/course/" + courseId, Course.class);
      
      
      
//        return userRating.getRatings().stream()
//                .map(rating -> {
//                    Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId(), Movie.class);
//                    return new CatalogItem(movie.getName(), movie.getDescription(), rating.getRating());
//                })
//                .collect(Collectors.toList());
      StudentCourse  studentCrse=new StudentCourse();
      studentCrse.setCity(student.getCity());
      studentCrse.setFname(student.getFname());
      studentCrse.setLname(student.getLname());
      studentCrse.setId(student.getId());
      studentCrse.setCourse(course.getCname());
   return studentCrse;
    }
}
