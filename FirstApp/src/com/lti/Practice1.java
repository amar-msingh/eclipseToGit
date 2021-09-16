package com.lti;

class leapY
{
	int leapYear(int year)
	{
		if(year%4==0&&year%100!=0||year%400==0)
			return 0;
		else if(year %100==0)
			return 1;
		else
			return 2;
	}
}
public class Practice1 {
public static void main(String[] args) {
	leapY ob=new leapY();
	System.out.println(ob.leapYear(2000));
	System.out.println(ob.leapYear(2001));
	System.out.println(ob.leapYear( 1900));
	System.out.println(ob.leapYear(2004));
	System.out.println(ob.leapYear(2100));
	System.out.println(ob.leapYear(2400));
	System.out.println(ob.leapYear(1901));
}
	
}
