package com.java.basics;

public class ReverseString {

	public static void main(String[] args) {
		
		String name="reddy";
		StringBuilder sb= new StringBuilder(name);
		//System.out.println(sb.reverse());
		
		String rev=" ";
		//char c[]=name.toCharArray();
		int len=name.length();
		
		//System.out.println(c);
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);

	}

}
