package Recursion;

public class lexicalorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer>list=new ArrayList();
sol(13,list,0);
	}
	  public static void sol(int n,ArrayList<Integer>list,int  ans)
	    {
	        
	         if(ans<=n&&ans!=0)
	        {
	        
	             list.add(ans);
	        }
	        
	        if(ans>n)return;
	       for(int i=0;i<=9;i++)
	        {
	           if(i==0&&ans==0)
	           {
	               continue;
	           }
	           if(ans==0)
	           {
	            sol(n,list,i);   
	           }
	           else{
	               sol(n,list,(ans*10)+i);
	           }
	            
	        }
	    }
}
