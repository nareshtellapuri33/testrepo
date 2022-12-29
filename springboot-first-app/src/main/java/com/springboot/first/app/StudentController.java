package com.springboot.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Tellapuri","Naresh");
		
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		List<Student> students = new ArrayList<>();
		students.add(new Student("Ramesh","Fadatare"));
		students.add(new Student("Tellapuri","Naresh"));
		students.add(new Student("James","Bond"));
		students.add(new Student("Hospet","Reshmi"));
		students.add(new Student("Gundampati","Narasimharaj"));
		students.add(new Student("Damodar","sunil"));
		return students;
	}
	//@PathVariable annotation
	@GetMapping("student/{firstName}/{lastName}")
	public Student studentPathVariable(@PathVariable("firstName")String firstName,
			@PathVariable("lastName")String lastName) {
		return new Student(firstName,lastName);
		
	}
	
	//build rest API to handle query Parameters
	@GetMapping("/student/query")
	public Student studentQueryParam(
			@RequestParam(name="firstName") String firstName,
			@RequestParam(name= "latName") String lastName) {
		return new Student(firstName,lastName);
	}	

}
