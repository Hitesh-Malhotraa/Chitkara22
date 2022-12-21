package Recursion;

public class find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,43,78,90,100};
find(arr,0,arr.length-1,120);
	}
	public static int find(int arr[],int lo,int hi,int trgt)
	{
		if(lo>hi)
		{
			return 
		}
		if(arr[lo]==trgt)
		{
			return lo;
		}
		int idx=find(arr,lo+1,hi,trgt);
	return idx;
	}

}
