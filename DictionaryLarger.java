package Recursion1;

public class DictionaryLarger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sol("abc","",false);

	}
	public static void sol(String str,String ans,boolean flag)
	{
		if(str.length()==0&&flag==true)
		{
			System.out.println(ans);
			return;
		}
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			String rem=str.substring(0,i)+str.substring(i+1);
			if(flag==false)
			{
//				check krna h;
				if(ch>str.charAt(0))
				{
					sol(rem,ans+ch,true);
				return;
				}
				else if(ch==str.charAt(0))
				{
					sol(rem,ans+ch,false);
				}
			
			}
			else {
				//no need to check;
				sol(rem,ans+ch,true);
		
			}
		}
	}

}
