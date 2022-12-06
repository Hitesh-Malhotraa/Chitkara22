package LinkedList;
import java.util.*;
public class linkedList {

	class Node {
		int val;
		Node next;
		public Node()
		{
			
		}
		public Node(int val)
		{
			this.val=val;
		}
	}

	private int size = 0;
	private Node head;
	private Node tail;

	public void addFirst(int val) {
		Node nn = new Node();
		nn.val = val;
		if (size == 0) {
			head = nn;
			tail = nn;
		} else {
			// isse phele head=2k tha;
			// line no 24 me maine ead chng kr diya
			nn.next = head;
			head = nn;
		}
		size++;
	}

	public void addLast(int val) {
		Node nn = new Node();
		nn.val = val;
		if (size == 0) {
			head = nn;
			tail = nn;
		} else {
			tail.next = nn;
			tail = nn;

		}
		size++;

	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
	}

	public void removeFirst() throws Exception {
		if (size == 0) {
			throw new Exception("LinkedList Khali h");

		}
		head = head.next;
		size--;

	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	public void removeLast() throws Exception {
		if (isEmpty()) {
			throw new Exception("LinkedList Khali h");
		}
		if (size() == 1) {
			head = null;
			tail = null;
			return;
		}
		Node prev = null;
		Node temp = head;
		while (temp.next != null) {
			prev = temp;
			temp = temp.next;
		}
		tail = prev;

		tail.next = null;
		size--;
	}

	public Node getAt(int idx) throws Exception {
		if (idx < 0 || idx >= size()) {
			throw new Exception("Invalid index");
		}
		int cnt = 0;
		Node temp = head;
		while (cnt < idx) {
			temp = temp.next;
			cnt++;
		}
		return temp;
	}

	public void insertAt(int idx, int val) throws Exception {
		if (idx < 0 || idx > size()) {
			throw new Exception("Invald index");
		}
		if (idx == 0) {
			addFirst(val);
			return;
		}
		if (idx == size()) {
			addLast(val);
			return;
		}
		Node temp = getAt(idx - 1);
		Node nn = new Node();
		nn.val = val;
		nn.next = temp.next;
		temp.next = nn;
		size++;
	}

	public void deleteAt(int idx) throws Exception {

		if (idx >= size() || idx < 0) {
			throw new Exception("Invalid index");
		}
		if (idx == 0) {
			removeFirst();
			return;
		}
		if (idx == size() - 1) {
			removeLast();
			return;
		}
		Node temp = getAt(idx - 1);
		temp.next = temp.next.next;
		size--;

	}

	public int getMid() {
		Node fast = head;
		Node slow = head;
		while (fast.next != null || fast.next.next != null) {
			fast = fast.next;
			if (fast.next != null) {
				fast = fast.next;
				slow = slow.next;
			} else {
				break;
			}

		}
		return slow.val;

	}

	class hlp {
		int size = 0;
		Node head;
	}

	public void reverse() {
		hlp h = new hlp();
		h.head = head;
		reverse(head, h, 0);
	}

	private void reverse(Node root, hlp h, int cnt) {
		if (root == null) {
			h.size = cnt;
			return;
		}
		reverse(root.next, h, cnt + 1);
		if (cnt > h.size / 2) {
			int temp = h.head.val;
			Node cur = h.head.next;
			h.head.val = root.val;
			root.val = temp;
			h.head = cur;
		}

	}

	public void fold() {
		fold(head, head, 0);
	}

private Node fold(Node root,Node head,int cnt)
{
	if(root==null)
	{
		return head;
	}
	Node res=fold(root.next,head,cnt+1);
if(cnt>size()/2)
{
	Node temp=res.next;
res.next=root;
root.next=temp;

return temp;
}
else if(cnt==size()/2)
{
	root.next=null;
	return res;
}
return null;
}

public void fold2()
{
	Stack<Node>s=new Stack();
	Node temp=head;
	while(temp!=null)
	{
		s.push(temp);
		temp=temp.next;
	}
	temp=head;
	while(!s.isEmpty())
	{
		Node rem=s.pop();
	Node cur=temp.next;
	temp.next=rem;
	rem.next=cur;
	temp=cur;
	if(rem==cur)
	{
		rem.next=null;
		break;
	}
	}
	
}

public int kLast(int k)
{
	if(k>size())
	{
		return -1;
	}
Node fast=head;
Node slow=head;
for(int i=0;i<k;i++)
{
	fast=fast.next;
}
while(fast!=null)
{
	fast=fast.next;
	slow=slow.next;
}
return slow.val;
}
public Node mid(Node head)
{
	Node temp=head;
	Node slow=head;
	Node fast=head;
	while(fast!=null&&fast.next!=null)
	{
		temp=slow;
		slow=slow.next;
		fast=fast.next.next;
	
	}
	return temp;
}
public void sort()
{
	head=sort(head,tail);
//	Node temp=head;
//	System.out.println(head==tail);
//	System.out.println(head==temp);
}
public Node sort(Node lo,Node hi)
{
	if(lo==hi)
	{
		
		//System.out.println("Hello");
		return new Node(lo.val);
	}
	Node temp=mid(lo);
	//System.out.println(temp.val);
	Node next=temp.next;
	temp.next=null;
	Node left=sort(lo,temp);
	Node right=sort(next,hi);
	Node ans=merge(left,right);
return ans;
}
public Node merge(Node left,Node right)
{
	 
	    Node strt=null;
	     Node prev=null;
	        Node i=left;
	        Node j=right;
	        while(i!=null&&j!=null)
	        {
	            if(i.val>j.val)
	            {
	                Node nn=new Node(j.val);
	                if(prev==null)
	                {
	                    strt=nn;
	                    prev=nn;
	                }
	                else{
	                    prev.next=nn;
	                    prev=nn;
	                }
	                j=j.next;
	            }
	            else if(j.val>i.val)
	            {
	                Node nn=new Node(i.val);
	                if(prev==null)
	                {
	                    strt=nn;
	                    prev=nn;
	                }
	                else{
	                    prev.next=nn;
	                    prev=nn;
	                }
	                i=i.next;
	            }
	            else{
	                Node nn=new Node(i.val);
	               
	            if(prev==null)
	            {
	                strt=nn;
	                prev=nn;
	                
	            }
	                else{
	                    prev.next=nn;
	                    prev=nn;
	                }
	                 i=i.next;
	            }
	        }
	     if(i!=null)
	     {
	         if(prev==null)
	         {
	             strt=i;
	         }
	         else{
	         prev.next=i;    
	         }
	         
	     }
	     if(j!=null)
	     {
	         if(prev==null)
	         {
	             strt=j;
	         }
	         else{
	         prev.next=j;
	     }
	     }
	     return strt;
	    }
		
}
