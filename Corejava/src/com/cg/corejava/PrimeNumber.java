package com.cg.corejava;

import java.util.Scanner;

public class PrimeNumber {
	public static void isPrime(int n)
	{
		
		for(int i=2;i<=n;i++){
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					break;
				}
				
			}
			System.out.println(i);
		}
	}
		

	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		isPrime(n);
	}
		
		// TODO Auto-generated method stub
		
		
		

	}

