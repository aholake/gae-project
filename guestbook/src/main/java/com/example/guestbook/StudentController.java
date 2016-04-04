package com.example.guestbook;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.guestbook.model.Student;
import com.example.guestbook.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	@RequestMapping(value = "/")
	public @ResponseBody String home() {
		return "home";
	}

	@RequestMapping(value = "/getAllStudent")
	public @ResponseBody List<Student> getAllStudent() {
		return studentService.getStudent();
	}
}
