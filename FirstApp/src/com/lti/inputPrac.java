package com.lti;

import java.util.Scanner;

public class inputPrac {
	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		int x;
		String names;
		boolean a;
		x=obj.nextInt();
		names=obj.next();
		a=obj.hasNext();
		System.out.println(x+names+a);
	}

}
