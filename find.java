package Recursion1;

public class find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3 };
		int ans = find(arr, 9, 0);
	}

	public static int find(int arr[], int trgt, int idx) {
		if (idx == arr.length) {
			return -1;
		}
		if (arr[idx] == trgt) {
			return idx;
		}
		int res = find(arr, trgt, idx + 1);
		return res;
	}

}
