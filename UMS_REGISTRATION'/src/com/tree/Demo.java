package com.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
		public static void main(String[] args) throws IOException {
			 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		     int testCase = Integer.parseInt(br.readLine());
		     
		     while(testCase>0)
		     {
		         String s=br.readLine();
		         int boxes=Integer.parseInt(s.split(" ")[0]);
		         int days=Integer.parseInt(s.split(" ")[1]);
		         int[] box=new int[boxes];
		         long[] out=new long[boxes];
		         String subIn=br.readLine();
		         for(int i=0;i<box.length;i++)
		         {
		             box[i]=Integer.parseInt(subIn.split(" ")[i]);
		             out[i]=Integer.parseInt(subIn.split(" ")[i]);
		         }
		         for(int k=1;k<days;k++)
		         {
			         for(int i=0;i<box.length;i++)
			         {
			             for(int j=i+1;j<box.length;j++)
			             {
			                 out[i]+=out[j];
			             }
			         }
		         }
		         for(int j=0;j<box.length;j++)
	             { 
		        	if(out[j]<998244353)
		        	{
		        		System.out.print(out[j]+" ");
		        	}
		        	else
		        	{
		        		long mod=out[j]%998244353;
		        		System.out.print(mod+" ");
		        	}
		        	System.out.println();
	             }
		         testCase--;
		     }
		}
}
