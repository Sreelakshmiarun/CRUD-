package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentContoller {

	@Autowired
	private StudentService studentService;

	@PostMapping("/saveStudent")
	public Student saveStudentt(@RequestBody Student stu) {
		studentService.saveStudent(stu);
		return stu;
     }
	
	@GetMapping("/getStudent")
	public List<Student> getStudents() {
		return studentService.getStudent();
	}
	
	@GetMapping("/getStudentId/{id}")
	public Optional<Student> getStudentid(@PathVariable(name="id") @RequestBody Integer id) {
		return studentService.getStudentId(id);			
	}
	
	@DeleteMapping("/deleteStudentId/{id}")
	public String deleteStudent(@PathVariable(name="id") @RequestBody Integer id) {
		return studentService.deleteStudentId(id);
	}
	
	@PutMapping("/updateStudent")
	public String updateStudents(@RequestBody Student stu) {
		return studentService.updateStudent(stu);	
	}
}