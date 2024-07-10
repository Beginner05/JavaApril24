package Recursion1;

import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		sol(str, "");
	}

	public static void sol(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String rem = str.substring(0, i) + str.substring(i + 1);
			sol(rem, ans + ch);
		}
	}

}
