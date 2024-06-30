package Recursion1;

public class qstn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int res=sol(4);
	System.out.println(res);
	}

	public static int sol(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		int res = sol(n - 1) * sol(n - 2);
		return res;
	}

}
