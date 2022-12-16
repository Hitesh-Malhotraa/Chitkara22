package BinaryTree;

public class clinetofBtg13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="10 true 20 true 30 false false true 40 false false true 50 true 60 false false true 70 false false";
BinaryTreeG13 bt=new BinaryTreeG13(str);
//	System.out.println(bt.height());
//	System.out.println("size"+bt.size());
//	System.out.println("max"+bt.max());
////	System.out.println("min"+bt.min());
//	//System.out.println("find"+bt.find(160));
//	
	//bt.levelOrder2();
	bt.inorder();
	bt.inOrder();
	}

}
