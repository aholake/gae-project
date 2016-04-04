package com.example.guestbook.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.guestbook.dao.StudentDao;
import com.example.guestbook.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getStudent() {
		List<Student> studentList = null;
		Session session = null;
		Transaction transaction = null;
		try {
			session = getSessionFactory().openSession();
			transaction = session.beginTransaction();
			transaction.setTimeout(5);

			studentList = session.createCriteria(Student.class).list();

			transaction.commit();
		} catch (RuntimeException re) {
			try {
				transaction.rollback();
			} catch (RuntimeException e) {
			}
			throw re;
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return studentList;
	}
}
