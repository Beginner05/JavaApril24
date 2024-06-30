package Recursion1;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans = fibo(n);
		System.out.println(ans);
	}

	public static int fibo(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int res = 0;
		int fh = fibo(n - 1);
		int sh = fibo(n - 2);
		res = fh + sh;
		return res;
	}

}
