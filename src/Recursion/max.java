package Recursion;

public class max {

	public static void main(String args[])
	{
		int arr[]= {10,100,130,40,60,132};
	max(arr,0,arr.length-1);
	}
	public static int max(int arr[],int lo,int hi)
	{
		int ans=max(arr,lo+1,hi);
		return Math.max(ans,arr[lo]);
	}
	
}
