package com.nanafebriana.model;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Size;

public class Student {
	
	private String name;
	
	@Size(min = 2, max = 30)
	private String address;
	private Long studentMobile;
	private Date studentDOB;
	private ArrayList<String> studentSkills;
	private Address studentAddress;

	public Student() {
	}

	public Student(String name, String address, Long studentMobile, Date studentDOB, ArrayList<String> studentSkills) {
		super();
		this.name = name;
		this.address = address;
		this.studentMobile = studentMobile;
		this.studentDOB = studentDOB;
		this.studentSkills = studentSkills;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}

	public Date getStudentDOB() {
		return studentDOB;
	}

	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}

	public ArrayList<String> getStudentSkills() {
		return studentSkills;
	}

	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
	}

	public Address getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}

}
