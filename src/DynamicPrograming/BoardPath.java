package DynamicPrograming;

import java.util.Scanner;

public class BoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int dest=scn.nextInt();
		int dice=scn.nextInt();
		//int ans=solTD(0,dest,dice,new int[dest]);
//System.out.println(ans);
System.out.println(solBu(0,dest,dice));
System.out.println(solBUSE(0,dest,dice));
	
	}
	public static int sol(int src,int dest,int dice)
	{
		if(src==dest)
		{
			return 1;
		}
		if(src>dest)return 0;
		int cnt=0;
		for(int i=1;i<=dice;i++)
		{
			cnt+=sol(src+i,dest,dice);
		}
		return cnt;
	}

	public static int solTD(int src,int dest,int dice,int arr[])
	{
		if(src==dest)
		{
			return 1;
		}
		if(src>dest)return 0;
		if(arr[src]!=0)
		{
			return arr[src];
		}
		int cnt=0;
		for(int i=1;i<=dice;i++)
		{
			cnt+=solTD(src+i,dest,dice,arr);
		}
		arr[src]=cnt;
		return cnt;
	}
		
	public static  int solBu(int src,int dest,int dice)
	{
		int arr[]=new int[dest+dice];
	arr[dest]=1;
	//System.out.println(arr[dest]);
	
	for(int i=dest-1;i>=0;i--)
	{
		int cnt=0;
		for(int j=1;j<=dice;j++)
		{
			cnt+=arr[i+j];
		}
		arr[i]=cnt;
	}
	return arr[0];
	}
	public static int solBUSE(int src,int dest,int dice)
	{
		int arr[]=new int[dest+1];
		arr[dest]=1;
		for(int i=dest-1;i>=0;i--)
		{
			
			
				int cnt=0;
				int j=1;
				while(j+i<arr.length&&j<=dice)
				{
					cnt+=arr[j+i];
				j++;
				}
				arr[i]=cnt;
			}
		
		return arr[0];
	}
}
