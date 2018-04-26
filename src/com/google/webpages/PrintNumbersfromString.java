package com.google.webpages;

public class PrintNumbersfromString
{
	public static void main(String[] args) 
	{
		String st1="ABC123";
		char[] ch=st1.toCharArray();
		System.out.println(ch);
		for(int i=3;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		
	}

}
