package Avl;

public class AVLG13 {

	class Node {
		int val;
		Node left;Node right;
		int ht=0;
		int bf=0;
	}
	Node root;
	public void add(int val)
	{
		root=add(root,val);
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
		update(root);
		return root;
	}
	public Node update(Node root)
	{
		updateHeightBal(root);
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
