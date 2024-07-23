package Recursion;

import java.util.Scanner;
public class Subset {

	public static void main(String[] args) {
		// TODO Auto-genrated method stub
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int arr[]=new int[n];
for(int i=0;i<arr.length;i++)
{
	arr[i]=scn.nextInt();
}
sol(arr);
	}
	public static void sol(int arr[])
	{
		int total=(int)Math.pow(2, arr.length);
		for(int i=0;i<total;i++)
		{
			String str=Integer.toBinaryString(i);
//			System.out.println(str);
			String ans="";
			int n=i;
for(int j=arr.length-1;j>=0;j--)
{
int rem=n%2;
if(rem==1)
{
	ans=arr[j]+ans;
	
}
n=n/2;
}
System.out.println(ans);
		}
		
	}

}
