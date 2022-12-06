package BinaryTree;
import java.util.Scanner;
public class BinaryTree {

	class Node{
		int val;
		Node left;
		Node right;
	}
	//lc:left child;
	Node root=null;
	Scanner scn;//lc ka mtlb h left child h ya nhi h?
	public BinaryTree(String str)
	{
		scn=new Scanner(str);
		root=construct(null,true);
		display(root);
	//root 10k h 
	}
	public Node  construct(Node root,boolean lc)
	{
		if(root==null)//parent node k liye kaam kr rha hun;
		{
			System.out.println("Enter the val for root node");
		}
		else {
			if(lc==true)
			{
				System.out.println("Enter the val for left child of "+" "+root.val);
			}
			else {
				System.out.println("Enter the val for right child of "+root.val);
			}
		}
		int val=scn.nextInt();
		Node nn=new Node();
		nn.val=val;
		System.out.println(nn.val+"has any left child ?");
		boolean hlc=scn.nextBoolean();
		if(hlc)
		{
		nn.left=construct(nn,true);
		}
		System.out.println(nn.val+" has any right child");
		boolean hrc=scn.nextBoolean();
		if(hrc==true)
		{
			nn.right=construct(nn,false);
		}
		return nn;
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
			str+=root.left.val+" <-";
		}
		else {
			str+=". <-";
		}
		str+=root.val+" ->";
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

public int size()
{
	return size(root);
}
public int size(Node root)
{
	if(root==null)
	{
		return 0;
	}
int lst=size(root.left);
int rst=size(root.right);
return lst+rst+1;
}
}