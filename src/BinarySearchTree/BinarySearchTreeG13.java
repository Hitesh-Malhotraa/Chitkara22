package BinarySearchTree;

public class BinarySearchTreeG13 {
class Node{
	int val;
	Node left;
	Node right;
}
Node root;
public BinarySearchTreeG13(int arr[])
{
	root=construct(arr,0,arr.length-1);
	display(root);
}
public Node construct(int arr[],int lo,int hi)
{
	if(lo>hi)
	{
		return null;
	}
	int mid=(lo+hi)/2;
	Node nn=new Node();
	nn.val=arr[mid];
	nn.left=construct(arr,lo,mid-1);
	nn.right=construct(arr,mid+1,hi);
	return nn;
}
public  void display(Node root)
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
public boolean search(int val)
{
	return search(root,val);
}
private boolean search(Node root,int val)
{
	if(root==null)
	{
		return false;
	}
	if(root.val==val)
	{
		return true;
	}
	if(root.val>val)
	{
		return search(root.left,val);
	}
	else if(root.val<val) {
		return search(root.right,val);
	}
	return false;
}
public int min()
{
	return min(root);
}
private int min(Node root)
{
	if(root==null)
	{
		return Integer.MAX_VALUE;
	}
	int ans=min(root.left);
return Math.min(ans, root.val);
}
}
