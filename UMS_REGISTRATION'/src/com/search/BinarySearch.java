package com.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearch {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter How Many Element You Enter");
	int k=Integer.parseInt(br.readLine());
	System.out.println("Enter Elements");
	int[] a= new int[k];
	for(int i=0;i<a.length;i++)
	{
		a[i]=Integer.parseInt(br.readLine());
	}
	System.out.println("Enter Element which you find");
	int mid=0,low=0,high=a.length-1,to_find=0;
	to_find=Integer.parseInt(br.readLine());
	while(high - low>0)
	{
		mid=(low+high)/2;
		if(a[mid]<to_find)
		{
			low=mid+1;
		}
		else
		{
			high=mid;
		}
	}
	if(a[low]==to_find)
	{
		System.out.println("Your Element is present this Index="+(low+1));
	}
	else if(a[high]==to_find)
	{
		System.out.println("Your Element is present this Index="+(high+1));
	}
	else
	{
		System.out.println("does not exist");
	}
}
}
