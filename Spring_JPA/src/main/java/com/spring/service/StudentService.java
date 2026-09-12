package com.spring.service;

import java.util.List;

import com.spring.entity.Student;


public interface StudentService 
{
	
     Student saveStudent(Student student);
     Student updateStudent(Student student);
     void deleteStudent(Long id);
     List<Student> findAll();
	 Student findById(Long id);  
}
