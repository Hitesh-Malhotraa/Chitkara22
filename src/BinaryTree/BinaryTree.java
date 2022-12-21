package BinaryTree;
import java.util.Scanner;
import java.util.*;
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
public int height()
{
	return height(root);
}
public  int height(Node root)
{
	if(root==null)
	{
		return -1;
	}
	int lh=height(root.left);
	int rh=height(root.right);
	return Math.max(lh, rh)+1;
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
	int res= Math.max(lmax,rmax);
return Math.max(res, root.val);
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
	int lmin=min(root.left);
	int rmin=min(root.right);
	return Math.min(lmin, Math.min(rmin, root.val));
}
public void leveorder()
{
	levelorder(root);
}
private void levelorder(Node root)
{
LinkedList<Node>q=new LinkedList();
q.addLast(root);
while(!q.isEmpty())
{
	Node temp=q.removeFirst();
	System.out.print(temp.val+" ");
	if(temp.left!=null)
	{
		q.addLast(temp.left);
	}
	if(temp.right!=null)
	{
		q.addLast(temp.right);
	}
}

}
public void levelOrder2()
{
	levelOrder2(root);
}
private void levelOrder2(Node root)
{
	LinkedList<Node>q=new LinkedList();
	q.addLast(root);
	q.addLast(null);
	while(!q.isEmpty())
	{
	Node temp=q.removeFirst();
	if(temp==null)
	{
		if(q.isEmpty())
		{
			break;
		}
		q.addLast(null);
		System.out.println();
		continue;
	}
	System.out.print(temp.val+" ");
	if(temp.left!=null)
	{
		q.addLast(temp.left);
	}
	if(temp.right!=null)
	{
		q.addLast(temp.right);
	}
	}
}
public void levelOrder3()
{
	levelOrder3(root);
}
private void levelOrder3(Node root)
{
	LinkedList<Node>q=new LinkedList();
	LinkedList<Node>hlp=new LinkedList();
	q.addLast(root);
	while(!q.isEmpty())
	{
		Node temp=q.removeFirst();
		System.out.print(temp.val+" ");
		if(temp.left!=null)
		{
			hlp.addLast(temp.left);
		}
		if(temp.right!=null)
		{
			hlp.addLast(temp.right);
		}
		if(q.isEmpty())
		{
			System.out.println();
			q=hlp;
			hlp=new LinkedList();
		}
	}
}
public void preOrder()
{
	preOrder(root);
}
private void preOrder(Node root)
{
	if(root==null)
	{
		return ;
	}
	System.out.println(root.val);//N wala kaam hogya;
	//mujhe left wala kaam krna h 
	preOrder(root.left);//left wala kaam hogya;
	//mujhe right wala kaam krna h
	preOrder(root.right);
	
	
}
public void postOrder()
{
	postOrder(root);
}
private void postOrder(Node root)
{if(root==null)
{
	return ;
}
	//left;
	postOrder(root.left);
	//right
	postOrder(root.right);
	System.out.println(root.val);
}
public void inOrder()
{
	inOrder(root);
}
private void inOrder(Node root)
{
	if(root==null)
	{
		return ;
	}
	//left;
	inOrder(root.left);
	//node ka kaam;
	System.out.println(root.val);
	//right;
	inOrder(root.right);
	
}
//public static class node{
//	int data;
//	node left;
//	node right;
//	 node(int val){
//		data=val;
//		left=null;
//		right=null;
//	}
//}
//public static node createTree(node root) {
//	Scanner sc = new Scanner(System.in);
//	int data=sc.nextInt();
//	root= new node(data);
//	if(data==-1) {
//		return null;
//	}
//	root.left=createTree(root.left);
//	root.right=createTree(root.right);
//	return root;
//}
//public static void printTree(node root) {
//	if(root==null) {
//		return;
//	}
//	System.out.println(root.data);
//	if(root.left!=null) {
//		printTree(root.left);
//	}
//	if(root.right!=null) {
//		printTree(root.right);
//	}
//}
public ArrayList<ArrayList<Integer>> zigzag()
{
	return zigZagTraversal(root);
}
public ArrayList<ArrayList<Integer>> zigZagTraversal(Node root) {
	ArrayList<ArrayList<Integer>> arr2 = new ArrayList<>();
	Queue<Node> q = new LinkedList<Node>();
	q.add(root);
	boolean leftToRight=true;
	while(!q.isEmpty()) {
	int size=q.size();
	ArrayList<Integer> ans = new ArrayList<>();
	for(int i=0;i<size;i++){
		Node front = q.poll();
		//System.out.println(front.val);
		ans.add(front.val);
//		if(leftToRight==true) {
//			
//			ans.add(i,front.val);
//		}
//		else {
//			ans.add(size-i-1,front.val);
//		}
		if(front.left!=null) {
			q.add(front.left);
		}
		if(front.right!=null) {
			q.add(front.right);
		}
	}
	
	if(leftToRight==false) {
		ArrayList<Integer>sol=new ArrayList();
		for(int i=ans.size()-1;i>=0;i--)
		{
			sol.add(ans.get(i));
		}
		ans=sol;
	}
	leftToRight=!leftToRight;
	arr2.add(ans);
}			
	return arr2;
}

//public static void main(String[] args) {
//	// TODO Auto-generated method stub
//	node root = null;
//	root = createTree(root);
////	printTree(root);
//	ArrayList<ArrayList<Integer>> ansf;
//	ansf = zigZagTraversal(root);
//	for(int i=0;i<ansf.size();i++) {
//		for(int j=0;j<ansf.get(i).size();j++) {
//			System.out.print(ansf.get(i).get(j));
//		}
//		System.out.println();
//	}
//
//}


}