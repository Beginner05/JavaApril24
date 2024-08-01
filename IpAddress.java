package Recursion;

public class IpAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
	System.out.println(sol(str,"",0));
	}
		public static List<String> sol(String str,String ans,int cnt)
	    {if(str.length()==0&&cnt==4)
	    {
	        List<String>br=new ArrayList();
	        br.add(ans);
	        return br;
	        // System.out.println(ans);
	    }
	        List<String>mr=new ArrayList();
	        for(int i=1;i<=3&&i<=str.length();i++)
	        {
	            String s=str.substring(0,i);
	            if(s.length()==2&&s.charAt(0)=='0')
	            {
	                return mr;
	            }
	            int val=Integer.parseInt(s);
//	             02=2;
	            if(val>255)
	            {
	                return mr;
	            }
//	             val<=255;
	            if(cnt==3)
	            {
	            List<String>res=sol(str.substring(i),ans+val,cnt+1);
	            for(int j=0;j<res.size();j++)
	            {
	                mr.add(res.get(j));
	            }
	            }
	                else{
	               List<String>res= sol(str.substring(i),ans+val+".",cnt+1);
	            for(int j=0;j<res.size();j++)
	            {
	                mr.add(res.get(j));
	            }
	                }
	            
	        }
	     return mr;
	    }
	}

	
