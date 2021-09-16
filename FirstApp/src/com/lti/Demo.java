package com.lti;

public class Demo {
	
	int empid;
	String name;
	 
	void setData()
	{
		empid=100;
		name="Amar Singh";
	}
	void displayInfo()
	{
		System.out.println("Employee id is "+empid);
		System.out.println("Name is "+name);
	}

	public static void main(String[] args) {
		
		 	Demo ob=new Demo();
		 	ob.setData();
		 	ob.displayInfo();
	System.out.println("Completed.");	 
	}

}
