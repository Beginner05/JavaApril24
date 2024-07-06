package Recursion1;

import java.util.HashMap;

public class GoodSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	sol(arr,0,arr.length-1)
		public int sol(int arr[],int lo,int hi,int moves)
	    {
	        if(lo==hi){
	            return 0;
	        }
	        if(lo>hi)return Integer.MAX_VALUE;
	        if(moves==3)
	        {
	            return arr[hi]-arr[lo];
	        }
	        int in=sol(arr,lo+1,hi,moves+1);
	        int ex=sol(arr,lo,hi-1,moves+1);
	    return Math.min(in,ex);
	    }
	}