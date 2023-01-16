package Heap;

public class ConstructHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
int arr[]= {1,2,3,2,4,7,8,5};
heap(arr);

for(int val:arr)
{
	System.out.print(val+" ");
}
	}
public static void heap(int arr[])
{
	int strt=(arr.length/2)-1;//last internal node
	
	while(strt>=0)
	{
		heapify(arr,strt);
		strt--;
	}
}
public static void heapify(int arr[],int idx) {
	int left=idx*2+1;
	int right=idx*2+2;
	int largest=idx;
	if(left<arr.length&&arr[idx]<arr[left])
	{
		largest=left;
	}
	if(right<arr.length&&arr[right]>arr[largest])
	{
		largest=right;
	}
	if(largest==idx) {
		return ;
	}
	else {
		int temp=arr[largest];
		arr[largest]=arr[idx];
		arr[idx]=temp;
	heapify(arr,largest);
	}
	
}
}
