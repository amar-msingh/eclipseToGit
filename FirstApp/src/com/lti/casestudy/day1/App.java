package com.lti.casestudy.day1;

import java.util.Scanner;

public class App {
public static void main(String[] args) {
	//scenario1();
	//scenario2();
	//scenario3();
	//scenarioex();
	
	
}
static void scenario1()
{
Student s[]=new Student[2];

String[] phnNo=new String[]{"9876543212","8897763627"};
s[0]=new Student(100,1998,"Amar Singh",phnNo) ;
String[] phnno=new String[] {"8892899333","8767898765"};
s[1]=new Student(101,1998,"Ankit Singh",phnno);

Student.collegeName="V.I.T";
Info s1=new Info();
s1.display(s[0]);
s1.display(s[1]);
}
static void scenario2() {
	Student.collegeName="G l Bajaj";
	Student s1[]=new Student[3];
	String phn[]= {"989775648","7587383929","5869698292"};
	s1[0]=new Student(100,1998,"Amar Singh",phn);
	String phn1[]= {"989325648","6547383929","9099698292"};
	s1[1]=new Student(101,1998,"Aman Singh",phn1);
	String phn2[]= {"765325648","8977383929","7129698292"};
	s1[2]=new Student(102,1999,"Ankit Maurya",phn2);
	Info s=new Info();
	for(int i=0;i<s1.length;i++)
	{
		s.display(s1[i]);
	}
	}
static void scenario3() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Number of student objects that you want");
	int numberOfObjects=sc.nextInt();
	sc.nextLine();
	Student[] stu=new Student[numberOfObjects];
	int id,dob;String name;
	Info i1=new Info();
	String phn[]=new String[2];
	for(int i=0;i<stu.length;i++)
	{
		Student.collegeName="G l bajaj";
		System.out.println("Enter the ID");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the date of birth");
		dob=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Name");
		name=sc.nextLine();
		System.out.println("Phone number");
		phn[0]=sc.next();
		phn[1]=sc.next();
		stu[i]=new Student(id,dob,name,phn);
		i1.display(stu[i]);
		}
}

static void scenarioex()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Number of student objects that you want");
	int numberOfObjects=sc.nextInt();
	sc.nextLine();
	Student[] stu=new Student[numberOfObjects];
	int id,dob;String name;
	Info i1=new Info();
	String phn[]=new String[2];
	for(int i=0;i<stu.length;i++)
	{
		Student.collegeName="G l bajaj";
		System.out.println("Enter the ID");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the date of birth");
		dob=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Name");
		name=sc.nextLine();
		System.out.println("Phone number");
		phn[0]=sc.next();
		phn[1]=sc.next();
		stu[i]=new Student(id,dob,name);
		stu[i].setPhoneNumber(phn);
		i1.display(stu[i]);
		}
}
}

	


