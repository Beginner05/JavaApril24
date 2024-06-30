package Recursion1;

public class qstn5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res[] = sol(4);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
		}
	}

	public static int[] sol(int n) {
		System.out.println(n);
		if (n == 0) {
			int arr[]= new int[5];
		return arr;
		}
		int res[] = sol(n - 1);
		res[n] = n + 1;
		return res;
	}

}
