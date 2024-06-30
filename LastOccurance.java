package Recursion1;

public class LastOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 2, 10 };
		int res = find(arr, 1, 0);
		System.out.println(res);
	}

	public static int find(int arr[], int trgt, int idx) {
		if (arr.length == idx) {
			return -1;
		}
		int res = find(arr, trgt, idx + 1);
		if (res == -1) {
			if (arr[idx] == trgt) {
				res = idx;
				return idx;
			}
		}
		return res;
	}

}
