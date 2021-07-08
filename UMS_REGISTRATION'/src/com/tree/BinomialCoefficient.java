package com.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinomialCoefficient {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(br.readLine());
	int k=Integer.parseInt(br.readLine());
	System.out.println(binomialCofficient(n, k)); 
}

	public static int binomialCofficient(int n,int k)
	{
		if(k>n)
			return 0;
		if(k==0 || n==k)
			return 1;
		return binomialCofficient(n-1,k-1)+binomialCofficient(n-1, k); 
	}
}
