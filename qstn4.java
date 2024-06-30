package Recursion1;

public class qstn4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol(5);
	}

	public static int sol(int n) {
		if (n == 0) {
			return 1;
		}
//		int res= sol(sol(n-1));
		int res=sol(n-1);
		sol(res);
	return res;
	}

}
