package Recursion1;

import java.util.Scanner;
public class RodCutting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=scn.nextInt();
	}
	int res=sol(n,arr);
	System.out.println(res);
	}
	public static int sol(int n,int price[])
	{
		if(n==0)
		{
			return 0;
		}
		int max=0;
		for(int cut=1;cut<=n;cut++)
		{
			int res=sol(n-cut,price)+price[cut-1];
		max=Math.max(res, max);
		}
		return max;
	}
	

}
