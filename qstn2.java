package Recursion1;

public class qstn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int res = sol(6);
		System.out.println(res);
	}

	public static int sol(int n) {
		if (n == 1) {
			return 1;
		}
		int res = sol(n - 1) * n;
		return res;
	}

}
