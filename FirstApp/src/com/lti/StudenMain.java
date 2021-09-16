package com.lti;

 class Student {
	int registrationid;
	void displayRegid()
	{
		System.out.println("Registration ID is <"+registrationid+">");
	}
	

}
 public class StudenMain{
	public static void main(String[] args) {
		Student ob=new Student();
		ob.registrationid=1290;
		ob.displayRegid();
	}
}
