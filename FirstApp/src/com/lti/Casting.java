package com.lti;

public class Casting {
public static void main(String[] args) {
	int x=100;
	char ch='A';
	float a=12.3f;
	a=x;
	x=ch;
	System.out.println(a);
	System.out.println(x);
	System.out.println("....................");
	
	x=(int) a;
	ch=(char) x;
	a=ch;
	System.out.println(ch);
	System.out.println(x);
	System.out.println(a);
	
	int x1=100;
	int y1=x1++;
	System.out.println(x1);
	System.out.println(y1);
}
}
