package Recursion.JavaApril24;
import java.util.ArrayList;
import java.util.HashSet;
public class Subset2 {
public static void main(String args[])
{
	int arr[]= {11,11,11,1,1,1,2,2,2,2,3,4,4,3,2,2,5,4,5,6};
	
//	HashSet<Integer>set=new HashSet();
//	HashSet<Integer>set2=new HashSet();
//for(int i=0;i<arr.length;i++)
//{
//	set.add(arr[i]);
//	set2.add(arr[i]);
//}
//set2.add(90);
//System.out.println(set);
//System.out.println(set2);
//System.out.println(set.hashCode());
//System.out.println(set2.hashCode());
ArrayList<Integer>list=new ArrayList();
ArrayList<Integer>list2=new ArrayList();
list.add(100);
list.add(200);
list.add(300);
list.add(400);
list.add(500);
list2.add(100);
list2.add(200);
list2.add(300);
list2.add(400);
list2.add(500);
System.out.println(list);
System.out.println(list2);
System.out.println(list.hashCode());
System.out.println(list2.hashCode());
//set.add()
HashSet<ArrayList<Integer>>set=new HashSet();
set.add(list2);
set.add(list);
System.out.println(set);

}
}
