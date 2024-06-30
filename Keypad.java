package Recursion1;

import java.util.*;

public class Keypad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		sol(str, "");
	}
//no  dabaya h 3or 7
//	3 pr h def
//	7 pr h pqrs
	public static void sol(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0);
		String alpha = get(ch);
		
		for (int i = 0; i < alpha.length(); i++) {
			sol(str.substring(1), ans + alpha.charAt(i));
		}
	}

	public static String get(char ch) {
		if (ch == '2') {
			return "abc";
		}
		if (ch == '3') {
			return "def";
		}
		if (ch == '4') {
			return "ghi";
		}
		if (ch == '5') {
			return "jkl";
		}
		if (ch == '6') {
			return "mno";
		}
		if (ch == '7') {
			return "pqrs";
		}
		if (ch == '8') {
			return "tuv";
		}
		if (ch == '9') {
			return "wxyz";
		}
		return "";
	}

}
