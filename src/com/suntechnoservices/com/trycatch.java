package com.suntechnoservices.com;

public class trycatch {

	public static void main(String[] args)
	{
		int a;
		try {
			a=100/0;
			System.out.println("a");
			
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	finally {
	System.out.println( "this is the project");

	}
	}
}
