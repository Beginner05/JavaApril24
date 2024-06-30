package Recursion1;

public class AllOccurance {

	static int global = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 1, 1 };
		int res = sol(arr, 0, 1);

	}

	public static int sol(int arr[], int idx, int trgt) {
		if (arr.length == idx)
			return 0;
		int cnt = 0;
		if (arr[idx] == trgt) {
			cnt += 1;
		}
		int res = sol(arr, idx + 1, trgt);
		return res + cnt;
	}
}