package Recursion1;

import java.util.Scanner;

public class Subsequncesum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=scn.nextInt();
	}
	int trgt=scn.nextInt();
boolean res=sol(0,0,trgt,arr);
//5
//1 2 5 5 3 
//10
System.out.println(res);
	}
	public static boolean sol(int idx,int sum,int trgt,int arr[])
	{
	
		if(idx>=arr.length)return false;
		if(trgt<sum)return false;
		if(trgt==sum)return true;
			
		
		boolean in=sol(idx+1,sum+arr[idx],trgt,arr);
		boolean ex=sol(idx+1,sum,trgt,arr);
		return in||ex;
	}

}
