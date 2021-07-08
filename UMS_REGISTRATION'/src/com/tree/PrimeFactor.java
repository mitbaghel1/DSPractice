package com.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeFactor {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int i=Integer.parseInt(br.readLine());
	primeFactor(i);
}

public static void primeFactor(int n)
{
	while (n%2==0)
    {
        System.out.print(2 + " ");
        n /= 2;
    }
	for(int k=3;k<= Math.sqrt(n);k++)
	{
		while(n%k==0)
		{
			System.out.print(k+" ");
			n /= k;
		}
	}
	
	if (n > 2)
	     System.out.print(n);
}
}
