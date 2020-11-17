package com.restapi.controller;

import com.restapi.model.Student;
import com.restapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

  @Autowired
  private StudentRepository studentRepository;

  @GetMapping
  public Iterable<Student> getAll() {
    return studentRepository.findAll();
  }
}
