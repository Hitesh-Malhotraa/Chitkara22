package BinaryTree;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="10 true 20 true 30 false false true 40 false false true 50 false false";
BinaryTree bt=new BinaryTree(str);
//System.out.println(c.size());
bt.display(bt.root);
bt.levelOrder3();
	}

}
