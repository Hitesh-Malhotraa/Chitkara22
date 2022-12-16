package BinaryTree;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class BinaryTreeG13 {

	class Node{
		int val;
		Node left;
		Node right;
	}
	Node root=null;
	Scanner scn;
	public BinaryTreeG13(String str)
	{
		scn=new Scanner(str);
		root=construct(null,false);
		display(root);
	}
	public Node construct(Node root,boolean lc)
	{
		if(root==null)
		{
			System.out.println("Enter the val for root node");
		}
			else {
				if(lc)
				{
					System.out.println("Enter the val for left child of "+root.val);
			}
				else {
					System.out.println("Enter the val for right child of "+root.val);
				}
		}
		Node nn=new Node();
		int val=scn.nextInt();
		nn.val=val;
		System.out.println(nn.val+" Has any left child ?");
		boolean hlc=scn.nextBoolean();
		if(hlc==true)
		{
		nn.left=construct(nn,true);
		}
		System.out.println(nn.val+" has any right child ?");
		boolean hrc=scn.nextBoolean();
		if(hrc)
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
			str+=root.left.val;
		}
		else {
			str+=".";
		}
		str+= " <-";
		str+=root.val+" -> ";
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
	private int size(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int ls=size(root.left);
		int rs=size(root.right);
	return ls+rs+1;
	}
	public int height()
	{
		return height(root);
	}
	private int height(Node root)
	{
		if(root==null)
		{
			return -1;
		}
		// hls: height of left subtree;
		//hrs: height of right subtree;
		int hls=height(root.left);
		int hrs=height(root.right);
		int max=Math.max(hls, hrs);
		return max+1;
	}
	public int max()
	{
		return max(root);
	}
	private int max(Node root)
	{if(root==null)
	{
		return Integer.MIN_VALUE;
	}
		int lmax=max(root.left);
		int rmax=max(root.right);
		int ans=Math.max(lmax, rmax);
		return Math.max(root.val, ans);
	}
	public int min()
	{
		return min(root);
	}
	public int min(Node root)
	{
		if(root==null)
		{
			return Integer.MAX_VALUE;
		}
		int lmin=min(root.left);
		int rmin=min(root.right);
		int min=Math.min(lmin, rmin);
		return Math.min(min, root.val);
	}
public boolean find(int trgt)
{
	return find(root,trgt);
}
private boolean find(Node root,int trgt)
{
	if(root==null)
	{
		return false;
	}
	if(root.val==trgt)
	{
		return true;
	}
	boolean l=find(root.left,trgt);
	boolean r=find(root.right,trgt);
	return l||r;
}
public void levelOrder()
{
	levelOrder(root);
}
private void levelOrder(Node root)
{
	LinkedList<Node>ll=new LinkedList();
ll.addLast(root);	
while(!ll.isEmpty())
{
	Node temp=ll.removeFirst();
	System.out.print(temp.val+" ");
	if(temp.left!=null)
	{
		ll.addLast(temp.left);
	}
	if(temp.right!=null)
	{
		ll.addLast(temp.right);
	}
}
}
public void levelOrder2()
{
	levelOrder2(root);
}
private void levelOrder2(Node root)
{
	LinkedList<Node>ll=new LinkedList();
	ll.addLast(root);
	ll.addLast(null);
while(!ll.isEmpty())
{
	Node temp=ll.removeFirst();
	if(temp==null)
	{
		if(ll.isEmpty())
		{
			break;
		}
		System.out.println();
		ll.addLast(null);
		continue;
	}
	System.out.print(temp.val+" ");
	if(temp.left!=null)
	{
		ll.addLast(temp.left);
	}
	if(temp.right!=null)
	{
		ll.addLast(temp.right);
	}
}
}
public void preOrder()
{
	preOrder(root);
}
private void preOrder(Node root)
{if(root==null)
{
	return ;
}
	//n l r
	System.out.println(root.val);
	preOrder(root.left);
	preOrder(root.right);
}
public void inOrder()
{
	inOrder(root);
}
private void inOrder(Node root)
{
	if(root==null)
	{
		return;
	}
	//l n r
	inOrder(root.left);
	System.out.print(root.val);
	inOrder(root.right);
}
public void postOrder()
{
	postOrder(root);
}
private void postOrder(Node root)
{if(root==null)
{
	return;
}
	//l r n
	postOrder(root.left);
	postOrder(root.right);
	System.out.print(root.val+" ");
}
public void inorder()
{
	inorder(root);
}
private void inorder(Node root)
{
	if(root == null)
	{
		return;
	}
	inorder(root.left);
	System.out.print(root.val+" ");
	inorder(root.right);
}

}
