package Avl;

//import BinarySearchTree.BinarySearchTree.Node;

public class AvlTree{
	class Node{
		int val;
		Node left;
		Node right;
		int bf=0;
		int ht=0;
	}
	Node root=null;
	public void add(int val)
	{
		root=add(root,val);
	}
	public void display()
	{
		display(root);
	}
	private void display(Node root)
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
	private Node add(Node root,int val)
	{
		if(root==null)
		{
			Node nn=new Node();
			nn.val=val;
			return nn;
		}
		if(root.val>val)
		{
			root.left=add(root.left,val);
		}
		else {
			root.right=add(root.right,val);
		}
		Node nn=root;
		nn=update(root);
		return nn;
	}
public Node update(Node root)
{
	updateHeightBal(root);
	if(root.bf==2)
	{
	if(root.left.bf==1)//ll
	{
		return rightRotation(root);
	}
	else {//lr;
		root.left=leftRotation(root.left);
		return rightRotation(root);
	}
	}
	else if(root.bf==-2)
	{
		if(root.right.bf==-1)//rr 
		{
			return leftRotation(root);
		}
		else {//rl
			root.right=rightRotation(root.right);
		return leftRotation(root);
		}
	}
	return root;
} 
public void updateHeightBal(Node root)
{
	int lh=-1;
	int rh=-1;
	if(root.left!=null)
	{
		lh=root.left.ht;
	}
	if(root.right!=null)
	{
		rh=root.right.ht;
	}
	int sh=Math.max(lh, rh)+1;
	int bf=lh-rh;
	root.ht=sh;
	root.bf=bf;
}
public Node rightRotation(Node root)
{
	Node nn=root.left;
	Node temp=nn.right;
	root.left=temp;
	nn.right=root;
	updateHeightBal(root);
	updateHeightBal(nn);
	return nn;
}
public Node leftRotation(Node root)
{
	Node nn=root.right;
	Node temp=nn.left;
	root.right=temp;
	nn.left=root;
	updateHeightBal(root);
	updateHeightBal(nn);
	return nn;
}
}
