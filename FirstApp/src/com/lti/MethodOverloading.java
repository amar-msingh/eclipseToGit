package com.lti;

public class MethodOverloading {
	
	int Max(int x,int y)
	{
		if(x>y)
			return x;
		else
			return y;
	}
	double Max(double x,double y)
	{
		if(x>y)
			return x;
		else
			return y;
	}

	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		System.out.println(m.Max(10,12));
		System.out.println(m.Max(7.0,9));
		

	}

}
