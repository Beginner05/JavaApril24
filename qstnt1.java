package Recursion1;

public class qstnt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol(5);
	}

	public static int sol(int n) {
		System.out.println(n);
		if (n == 0) {
			return 0;
		}
		int res = sol(n - 1);
		System.out.println(res);
		return 0;
	}

}
