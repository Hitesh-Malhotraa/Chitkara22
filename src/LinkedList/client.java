package LinkedList;
import java.util.LinkedList;
public class client {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
linkedList ll=new linkedList();
ll.addLast(10);
ll.addLast(20);
ll.addLast(30);
ll.addLast(40);
ll.addLast(50);
ll.addFirst(100);
ll.addFirst(90);
ll.display();
System.out.println("*****");
//ll.fold2();
//ll.display();
//System.out.println(ll.kLast(10));
ll.sort();
ll.display();
	}
}
