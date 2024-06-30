package Recursion1;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]=new int[3][3];
//cc=current colm
//cr=current row
//ec=end col
//er=end row
//int ec=2;
//int er=3;

int res=sol(0,arr.length-1,0,arr[0].length-1);
System.out.println(res);
	}
	public static int sol(int cr,int er,int cc,int ec)
	{
		if(cr==er&&cc==ec)
		{
			return 1;
		}
		if(cr>er||cc>ec)
		{
			//negative base case
//			yha se apne dest tk nhi phoch skte
			return 0;
		}
		int h=sol(cr,er,cc+1,ec);
		int v=sol(cr+1,er,cc,ec);
		return h+v;
	}
}
