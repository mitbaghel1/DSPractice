package com.Array;

public class SelectionSort {
public static void main(String[] args) {
	String []arr= {"GeeksforGeeks","Practice.GeeksforGeeks","GeeksQuiz","floppy","flower"};
	int n=arr.length;
	 for(int i = 0; i < n - 1; i++)
	    {
	     
	        int min_index = i;
	        String minStr = arr[i];
	        for(int j = i + 1; j < n; j++)
	        {
	             
	            /*compareTo() will return a -ve value,
	            if string1 (arr[j]) is smaller than string2 (minStr)*/
	            // If arr[j] is smaller than minStr
	         
	            if(arr[j].compareTo(minStr) < 0)
	            {
	                // Make arr[j] as minStr and update min_idx
	                minStr = arr[j];
	                min_index = j;
	            }
	        }
	 
	    // Swapping the minimum element
	    // found with the first element.
	    if(min_index != i)
	    {
	        String temp = arr[min_index];
	        arr[min_index] = arr[i];
	        arr[i] = temp;
	    }
	    }
	  for (int i=0; i<n; ++i)
          System.out.print(arr[i]+" ");
      System.out.println();
}
}
