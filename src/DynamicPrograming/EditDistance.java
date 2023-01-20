package DynamicPrograming;

public class EditDistance {

	public static void main(String args[])
	{
		String s1="horse";
		String s2="ros";
		solBu("horse","ros");
		sol("horse","ros");
		solTd("horse","ros",new int[s1.length()][s2.length()]);
	}
	   
	    public static int sol(String str1,String str2)
	    {
	        if(str1.length()==0||str2.length()==0)
	        {
	            if(str1.length()==0)
	            {
	                return str2.length();
	            }
	            return str1.length();
	        }
	        char ch1=str1.charAt(0);
	        char ch2=str2.charAt(0);
	        if(ch1==ch2)
	        {
	            return sol(str1.substring(1),str2.substring(1));
	        }
	        else{
	            int in=sol(str1.substring(1),str2);
	        int del=sol(str1,str2.substring(1));
	                int rep=sol(str1.substring(1),str2.substring(1));
	            return Math.min(in,Math.min(del,rep))+1;
	            }
	    }
	    
	    public static int solTd(String str1,String str2,int visited[][])
	    {
	        if(str1.length()==0||str2.length()==0)
	        {
	            if(str1.length()==0)
	            {
	                return str2.length();
	            }
	            return str1.length();
	        }
	        if(visited[str1.length()][str2.length()]!=0)
	        {
	            return visited[str1.length()][str2.length()];
	        }
	        char ch1=str1.charAt(0);
	        char ch2=str2.charAt(0);
	        if(ch1==ch2)
	        {
	            int ans= solTd(str1.substring(1),str2.substring(1),visited);
	        visited[str1.length()][str2.length()]=ans;
	            return ans;
	        }
	        else{
	            int in=solTd(str1.substring(1),str2,visited);
	        int del=solTd(str1,str2.substring(1),visited);
	                int rep=solTd(str1.substring(1),str2.substring(1),visited);
	            int ans= Math.min(in,Math.min(del,rep))+1;
	        visited[str1.length()][str2.length()]=ans;
	            return ans;
	        }
	    }
	    public static int solBu(String str1,String str2)
	    {
	        int visited[][]=new int[str1.length()+1][str2.length()+1];
	            for(int i=0;i<str2.length();i++)
	            {
	                int val=str2.length()-i;
	                visited[str1.length()][i]=val;
	            }
	        for(int i=0;i<str1.length();i++)
	        {
	            int val=str1.length()-i;
	            visited[i][str2.length()]=val;
	        }
	        for(int i=str1.length()-1;i>=0;i--)
	        {
	            for(int j=str2.length()-1;j>=0;j--)
	            {
	                if(str1.charAt(i)==str2.charAt(j))
	                {
	                    visited[i][j]=visited[i+1][j+1];
	                }
	                else{
	                    int in=visited[i+1][j];
	                int rep=visited[i][j+1];
	                        int del=visited[i+1][j+1];
	                    int ans=Math.min(in,Math.min(del,rep))+1;
	                visited[i][j]=ans;    
	                }
	            }
	        }
	            
	     return visited[0][0];   
	    }
	    
	}

