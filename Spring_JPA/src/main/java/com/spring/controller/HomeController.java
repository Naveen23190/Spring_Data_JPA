package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.Student;
import com.spring.repository.StudentRepository;
import com.spring.service.StudentService;
import com.spring.service.StudentServiceImpl;

@RestController
public class HomeController 
{
	Student student = null;
	@Autowired
	private StudentService studentService;

	@RequestMapping("/")
	public String home() {
		return "Welcome Spring Data JPA";
	}

//	@RequestMapping("/save")
//	public String save() {
//		student = new Student();
//		student.setName("Naveen");
//		student.setAge(25);
//		studentService.saveStudent(student);
//		return "Successfully Saved";
//		// return studentService.saveStudent(student) -> it will give the saved data to
//		// the browser
//	}
	
	@PostMapping("/save")
	public String save(@RequestBody Student student) 
	{
		studentService.saveStudent(student);
		return "Successfully Saved";
	}
	// Use Postman To Send The Data "https://localhost:8080/save" use the URL and mention the post type and 
	// `{"name" : "Rani" , "age" : 22}` and Click On Send ->   It Will Directly Store Into The Table
	@RequestMapping("/update")
	public String update() 
	{
		student.setName("M S Naveen Kumar");
		studentService.updateStudent(student);
		return "Successfully Updated";
	}

	@RequestMapping("/find/{id}")
	public Student find(@PathVariable Long id) {
		return studentService.findById(id);
	}

	@RequestMapping("/findAll")
	public List<Student> findAll() {
		return studentService.findAll();
	}
}
