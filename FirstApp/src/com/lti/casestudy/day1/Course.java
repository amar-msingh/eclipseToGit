package com.lti.casestudy.day1;

public class Course {
	private int id,duration,fees;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Course(int id, String name,int duration, int fees ) {
		super();
		this.id = id;
		this.duration = duration;
		this.fees = fees;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Course [id=" + id +  ", name=" + name +", duration=" + duration + ", fees=" + fees + "]";
	}
	
}
