package Recursion;

public class NQueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		sol(0,n,0,n,n,0,new boolean[n][n],"");
	String str="abc";
	str.s
	}
	public static void sol(int cr,int er,int cc,int ec,int tq,int qpsf,boolean visited[][],String ans)
	{
		if(tq==qpsf)
		{
			System.out.println(ans);
			return;
		}
		if(cc>=ec)
		{
			//return;
			//sol(cr+1,ec,0,ec,tq,qpsf,visited,ans);
			return;
		}
		if(cr>=er)return;
		if(isItSafe(cr,cc,visited))
		{visited[cr][cc]=true;
			sol(cr+1,er,0,ec,tq,qpsf+1,visited,ans+cr+" "+cc+" , ");//1
		visited[cr][cc]=false;
		}
		
		sol(cr,er,cc+1,ec,tq,qpsf,visited,ans);//2
	
	}
	public static boolean isItSafe(int cr,int cc,boolean visited[][])
	{
	//A
		int sr=cr;
				int sc=cc;
				while(sr>=0&&sc>=0)
				{
					if(visited[sr][sc])return false;
					sr--;
					sc--;
				}
				//b;
				sr=cr-1;
				sc=cc;
				while(sr>=0&&sc>=0)
				{
					if(visited[sr][sc])return false;
					sr--;
				}
				//c;
				sc=cc;
				sr=cr;
				while(sr>=0&&sc<visited.length)
				{
					if(visited[sr][sc])
						return false;
					sr--;
					sc++;
				}
				return true;
	}
}
