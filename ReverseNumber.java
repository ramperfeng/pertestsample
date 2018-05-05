package com.java.basics;

public class ReverseNumber {

	public static void main(String[] args) {
	
		int nu=256314;
		
		int re=0;
		while(nu !=0)
		{
			re=re*10+nu%10;
			nu=nu/10;
			
		}
       
		System.out.println(re);
	}

}
