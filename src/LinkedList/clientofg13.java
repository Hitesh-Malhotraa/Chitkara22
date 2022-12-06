package LinkedList;
import java.util.Scanner;
public class clientofg13 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
linkedlistg13 ll=new linkedlistg13();

Scanner scn=new Scanner(System.in);
ll.addLast(10);
ll.addLast(11);
ll.addLast(0);
ll.addLast(1);
ll.addLast(-10);
ll.addLast(1001);
ll.sort();
ll.display();
	}

}
