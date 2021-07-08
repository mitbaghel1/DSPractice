package com.Array;

public class ReverseArray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int n=arr.length;
		getReverseArray(arr,0,n-1);
	}
	
	public static void getReverseArray(int []arr,int start,int end)
	{
		for(int i=0;i<=end;i++)
		{
			while(start<end)
			{
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end--;
			}
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
