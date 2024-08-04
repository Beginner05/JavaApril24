package Recursion.JavaApril24;

public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int arr[]= {1,2,3};
sol(arr,new boolean[arr.length],0,new ArrayList());
	// TODO Auto-generated method stub
	}	
public static List<List<Integer>> sol(int[] arr, boolean visited[], int cnt, List<Integer> list) {
		if (cnt == arr.length) {
			List<List<Integer>> br = new ArrayList();
			List<Integer> res = new ArrayList();
			res = list;
			br.add(res);
			// System.out.println(br);
			return br;
		}
		List<List<Integer>> mr = new ArrayList();
		for (int i = 0; i < arr.length; i++) {
			if (visited[i] == false) {
				visited[i] = true;

				list.add(arr[i]);
				List<List<Integer>> res = sol(arr, visited, cnt + 1, list);
				visited[i] = false;
				list.remove(list.size() - 1);
				// cnt=0;
				for (int j = 0; j < res.size(); j++) {
					mr.add(res.get(j));
				}
			}
		}
		// System.out.println(mr);
		return mr;
	}
}
