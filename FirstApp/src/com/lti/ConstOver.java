package com.lti;

import packA.C;
import packA.D;

class bike{
	private int model;
	private String name;
	bike()
	{
		this(11,"very");
		model=1120;
		name="Dominar";
		System.out.println("Done");
	}
	bike(int model,String name)
	{
		
		this.model=model;
		this.name=name;
		System.out.println("Done2");
	}
}
public class ConstOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike b1=new bike();

	}

}
