package com.Array;
/**
 * 
 * @author Baghel Mit
 * @category array
 *
 */

public class MinMax {
    public static void main (String[] args)
    {
        int arr[] = { 12, 1234, 45, 67, 1 };
        int n = arr.length;
        // First Method Using Bubble Sort
        getMinMax(n,arr);
        // Second Method
        getMin(n,arr);
        getMax(n,arr);
    }
    public static void getMinMax(int n,int ar[])
    {
    	for(int i=0;i<n;i++)
    	{
    		for(int j=0;j<n-i-1;j++)
    		{
    			if(ar[j]>ar[j+1])
    			{
    				int temp=ar[j];
    				ar[j]=ar[j+1];
    				ar[j+1]=temp;
    			}
    		}
    	}
    	for(int i=0;i<n;i++)
    	{
    		System.out.println(ar[i]);
    	}
    	System.out.println(ar[0]+" "+ar[n-1]);
    }
    
    public static void getMin(int n,int[] ar)
    {
    	int min=ar[0];
    	for(int k=0;k<n;k++)
    		min=Math.min(min, ar[k]);
    	
    	System.out.print(min+" ");
    }
    public static void getMax(int n,int[] ar)
    {
    	int max=ar[0];
    	for(int k=0;k<n;k++)
    		max=Math.max(max, ar[k]);
    	System.out.println(max);
    }
}
