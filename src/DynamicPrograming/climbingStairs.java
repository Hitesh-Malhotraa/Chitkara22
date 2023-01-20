package DynamicPrograming;

public class climbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(solTD(0,44,new int [44]));
	}
	public static int sol(int strt,int dest)
	{
		if(strt==dest)return 1;
		if(strt>dest)return 0;
		int cnt=0;
		cnt+=sol(strt+1,dest);
		cnt+=sol(strt+2,dest);
		return cnt;
	}
	public static int solTD(int strt,int dest,int arr[])
	{
		if(strt==dest)return 1;
		if(strt>dest)return 0;
		int cnt=0;
		if(arr[strt]!=0)
		{
			return arr[strt];
		}
		cnt+=solTD(strt+1,dest,arr);
		cnt+=solTD(strt+2,dest,arr);
		arr[strt]=cnt;
		return cnt;
	}

}
