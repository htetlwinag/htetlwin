package com.base.response.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.response.entity.Student;
import com.base.response.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepo;

	public List<Student> getStudent() {
		return studentRepo.findAll();
	}
	public Student addStudent(Student student) {
		return studentRepo.save(student);
	}
}
