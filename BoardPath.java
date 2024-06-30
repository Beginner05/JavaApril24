package Recursion1;

public class BoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = paths(0, 10, 6);
		System.out.println(res);
	}

	public static int paths(int src, int dest, int dice) {

		if (src == dest) {
			return 1;
		}
		if (src > dest) {
			return 0;
		}

		int cnt = 0;
for(int jump=1;jump<=dice;jump++)
{
	cnt+=paths(src+jump,dest,dice);
}
		return cnt;
	}

}
