package com.tree;

public class RecursiveFunctionUdingBottomUp {
public static void main(String[] args) {
	int n=100;
	getFibbo(n);
}
public static void getFibbo(int n)
{
	int[] f=new int[n];
	f[0]=0;
	f[1]=1;
	
	for(int i=2;i<n;i++)
	{
		f[i]=f[i-1]+f[i-2];
	}
	
	for(int k=0;k<f.length;k++)
	{
		System.out.println(f[k]);
	}
}
}
