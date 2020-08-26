package com.example.student.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.student.model.Student;

@Repository
public interface StudentDetailsService extends JpaRepository<Student,Integer> {

}
