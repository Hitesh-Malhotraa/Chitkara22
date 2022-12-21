package Recursion;

public class LastOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {10,20,304,1,1,1,2};
find(arr,0,1);
	}
	public static int find(int arr[],int lo,int trgt)
	{
		if(lo>arr.length-1)
		{
			return -1;
		}
		int idx=find(arr,lo+1,trgt);
		if(idx!=-1)
		{
			return idx;
		}
		else {
			if(arr[lo]==trgt)
			{
				return  lo;
			}
			return -1;
		}
	}
	public int sol(int value,int n)
	{if(n==1)
	{
		return 1;
	}
		int val=sol(value,n-1);
		val=val*value;
		System.out.println(val);
	return val;
	}

}
