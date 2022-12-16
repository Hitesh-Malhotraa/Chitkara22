package BinarySearchTree;

public class BinarySearchTree {

	class Node{
		int val;
		Node left;
		Node right;
	}
	int arr[];
	Node root=null;
	public BinarySearchTree(int arr[])
	{
		this.arr=arr;
	root=construct(arr,0,arr.length-1);
	display(root);
	}
	public void display(Node root)
	{
		if(root==null)
		{
			return;
		}
		String str="";
		if(root.left!=null)
		{
			str+=root.left.val;
		}
		else {
			str+=".";
			
		}
		str+=" <- "+root.val+" -> ";
		if(root.right!=null)
		{
			str+=root.right.val;
		}
		else {
			str+=".";
					
		}
		System.out.println(str);
		display(root.left);
		display(root.right);
	}
	public Node construct(int []arr,int lo,int hi)
	{
		if(lo>hi)
		{
			return null;
		}
		if(lo==hi)
		{
			Node nn=new Node();
			nn.val=arr[lo];
			return nn;
		}
		int mid=(lo+hi)/2;
		Node nn=new Node();
		nn.val=arr[mid];
		nn.left=construct(arr,lo,mid-1);
	nn.right=construct(arr,mid+1,hi);
	return nn;
	}
	public int max()
	{
		return max(root);
		
	}
	private int max(Node root)
	{
		if(root==null)
		{
			return Integer.MIN_VALUE;
		}
		int max=max(root.right);
	return Math.max(max, root.val);
	}
}
