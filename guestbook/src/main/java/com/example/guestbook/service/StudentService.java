package com.example.guestbook.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.guestbook.model.Student;

public interface StudentService {

	public List<Student> getStudent();
}
