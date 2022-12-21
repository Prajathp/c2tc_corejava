package com.cg.corejava;

import java.util.Scanner;

public class Naturalnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		for(int i=n1;i<=n2;i++)
		{
			sum=sum+i;
			
		}
		System.out.println(sum);
		

	}

}
