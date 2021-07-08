package com.Patterns;

import java.util.Arrays;

public class Pyramid {
	
	static private class DemoInner{
		
	}
	
	public static void main(String[] args) {
		boolean b=false;
		//type-1
		for(int i=1;i<=5;i++)
		{
			for(int k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		//type 2
		for(int i=1;i<=5;i++)
		{
			for(int k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		String s=" mit";
		System.out.println(s.trim());
		
		
		//Strign in all counts
		String demo="mit";
		String demo1="imt";
		
		
	}
}
