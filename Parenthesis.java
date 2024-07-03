package Recursion1;

public class Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol(3, 0, 0, "");
	}

	public static void sol(int n, int cb, int ob, String ans) {
		if(cb>ob||ob>n)return;
		if (cb + ob == 2 * n) {
			System.out.println(ans);
			return;
		}
	
//		if(ob>cb)
		sol(n, cb, ob + 1, ans + "(");
		sol(n, cb + 1, ob, ans + ")");

	}

}
