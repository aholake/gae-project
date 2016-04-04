package com.example.guestbook.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student", catalog = "javatraining")
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7869647512121460336L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;

	@Column(name = "address")
	private String address;

	@Column(name = "age")
	private int age;

	public Student() {

		super();

	}

	public Student(int id, String name, String email, String address, int age) {

		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.age = age;
	}

	public Student(String name, String email, String address, int age) {

		this.name = name;
		this.email = email;
		this.address = address;
		this.age = age;

	}

	public int getId() {

		return id;

	}

	public void setId(int id) {

		this.id = id;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getEmail() {

		return email;

	}

	public void setEmail(String email) {

		this.email = email;

	}

	public String getAddress() {

		return address;

	}

	public void setAddress(String address) {

		this.address = address;

	}

	public int getAge() {

		return age;

	}

	public void setAge(int age) {

		this.age = age;

	}

	@Override
	public String toString() {

		return "Student [id=" + id + ", name=" + name + ", email=" + email
				+ ", address=" + address + ", age=" + age + "]";

	}

}
