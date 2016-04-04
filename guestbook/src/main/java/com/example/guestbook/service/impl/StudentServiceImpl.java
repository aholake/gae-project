package com.example.guestbook.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.guestbook.dao.StudentDao;
import com.example.guestbook.model.Student;
import com.example.guestbook.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentDao;
	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return studentDao.getStudent();
	}

}
