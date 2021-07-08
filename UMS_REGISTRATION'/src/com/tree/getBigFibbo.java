package com.tree;

import java.math.BigInteger;

public class getBigFibbo {
public static void main(String[] args) {
	int n=1000000;
	getBigFibbo g=new getBigFibbo();
	g.getFibbo(n);
}
	
	public void getFibbo(int n)
	{
		BigInteger a=BigInteger.valueOf(0);
		BigInteger b=BigInteger.valueOf(1);
		BigInteger c=BigInteger.valueOf(2);
		System.out.println(a+" "+b);
		for(int i=3;i<=n;i++)
		{
			c=a.add(b);
			a=b;
			b=c;
			System.out.println(c);
		}
	}
}
