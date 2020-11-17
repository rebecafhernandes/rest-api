package com.restapi.service;

import com.restapi.model.Student;
import com.restapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

  @Autowired
  private StudentRepository studentRepository;

  public Iterable<Student> getAll() {
    return studentRepository.findAll();
  }
}
