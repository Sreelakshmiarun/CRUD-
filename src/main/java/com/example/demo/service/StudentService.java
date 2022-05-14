package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo studentRepo;

	public Student saveStudent(Student stu) {
		return studentRepo.save(stu);
	}

	public List<Student> getStudent() {
		return studentRepo.findAll();
	}

	public  Optional<Student>  getStudentId(Integer id) {
		return studentRepo.findById(id);
	}
	
	public String deleteStudentId(Integer id) {		
		studentRepo.deleteById(id);
		return "Deleted";
	}
	
	public String updateStudent(Student stu) {
		studentRepo.save(stu);
		return "Updated";
	}

}
