package BinarySearchTree;

public class clientofbstg13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,4,6,98,100,150};
BinarySearchTreeG13 bst=new BinarySearchTreeG13(arr);
System.out.println("***********");

System.out.println(bst.search(0));
System.out.println(bst.search(160));
System.out.println(bst.min());
	}

}
