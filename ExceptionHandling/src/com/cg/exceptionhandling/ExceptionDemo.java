package com.cg.exceptionhandling;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int b=sc.nextInt();
		try {
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
			

	}

}
