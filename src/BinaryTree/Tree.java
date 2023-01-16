package BinaryTree;
import java.util.*;
public class Tree {

class Node{
	Node left;
	Node right;
	int val;
}
Node root;
Scanner scn;
public Tree()
{
	construct(null,false);
}
public Node construct(Node root,boolean lc)
{
	if(root==null)
	{
		System.out.println("Enter the  data for root node");
	}
	else {
		if(lc)
		{
			System.out.println("enter the data for left child of "+root.val);
			
		}
		else {
			System.out.println("enter the data for right child of "+ root.val);
		}
	}
	Node nn=new Node();
	nn.val=scn.nextInt();
System.out.println(nn.val+"has any left child?");
boolean hlc=scn.nextBoolean();
if(hlc)
{
	nn.left=construct(nn,true);
}
System.out.println(nn.val+"has any right child?");
boolean hrc=scn.nextBoolean();
if(hrc)
{
	nn.right=construct(nn,false);
}
return nn;
}
}
