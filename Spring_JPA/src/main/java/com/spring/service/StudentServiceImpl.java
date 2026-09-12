package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.Student;
import com.spring.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent( Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);

	}

	@Override
	public Student findById(Long id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

}
