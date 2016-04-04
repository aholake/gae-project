package com.example.guestbook.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.guestbook.model.Student;

public interface StudentDao {

	public List<Student> getStudent();
}
