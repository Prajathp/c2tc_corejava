package com.cg.corejava;

public class Demo {
	public static void main(String args[])
	{
		String str1="Hello",str2;
		str2=str1.concat("Hello");
		System.out.println(str1);
		System.out.println(str2);
		
		StringBuffer str3=new StringBuffer("Hello");
		str3.append("Hello");
		System.out.println(str3);
		
	}

}
