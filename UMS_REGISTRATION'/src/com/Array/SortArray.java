package com.Array;

/**
 * 
 * @author Baghel Mitkumar
 * @category Array
 *
 */
public class SortArray {
	public static void main(String[] args) 
	{
		int arr[]= {10,3,1,15,4,1};
		int n=arr.length;
		//asc Order
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("ASC ORDER");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
		//desc Order
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("DESC ORDER");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
