package com.lti.casestudy.day1;

import java.util.Arrays;

public class Student {
	
	int id,dateofbirth;
	String name;
	static String collegeName;
	String phoneNumber[];
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(int dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String[] getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String[] phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Student(int id, int dateofbirth, String name, String[] phoneNumber) {
		super();
		this.id = id;
		this.dateofbirth = dateofbirth;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	public Student(int id, int dateofbirth, String name) {
		super();
		this.id = id;
		this.dateofbirth = dateofbirth;
		this.name = name;	}		
	@Override
	public String toString() {
		return "Student [id=" + id + ", dateofbirth=" + dateofbirth + ", name=" + name + ", phoneNumber="
				+ Arrays.toString(phoneNumber) + "]";
	}
}
