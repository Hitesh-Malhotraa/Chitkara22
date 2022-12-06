package LinkedList;
import java.util.*;
public class linkedlistg13 {

	class Node{
		int val;
		Node next;
	}
private Node head;
private Node tail;
private int size=0;
public int size()
{
	return size;
}
public void addFirst(int val)
{
	
	Node nn=new Node();
	nn.val=val;
	if(size()==0)
	{
		head=nn;
		tail=nn;
	}
	else {
	nn.next=head;
	head=nn;
	}
	size++;
}
public void display()
{Node temp=head;
	while(temp!=null)
	{
System.out.print(temp.val+" ");
temp=temp.next;
}
	
}
public void addLast(int val)
{
	
	Node nn=new Node();
	nn.val=val;
	if(size()==0)
	{
		head=nn;tail=nn;
		
	}
	else {
	tail.next=nn;
	tail=nn;
}
	size++;
}
public void removeFirst() throws Exception
{
	if(size()==0)
	{
		throw new Exception("LinkedList Khali h");
	}
	head=head.next;
	size--;
}
public void removeLast()throws Exception
{
	if(size()==0)
	{
		throw new Exception("LinkedList is Empty");
	}
	if(size==1)
	{
		head=null;
		tail=null;
		size--;
		return;
		
	}
	Node temp=head;
	while(temp.next!=tail)
	{
		temp=temp.next;
	}
	temp.next=null;
	tail=temp;
	size--;
}
public Node getAt(int idx)throws Exception
{
	
	if(idx>=size()||idx<0)
	{
		throw new Exception("Invalid Index");
	}
	Node temp=head;
	int cnt=0;
	while(cnt<idx)
	{
		temp=temp.next;
		cnt+=1;
	}
	return temp;
}
public void insertAt(int idx,int val)throws Exception
{
	if(idx<0||idx>size())
	{
		throw new Exception("Invalid Index");
	}
	if(idx==0)
	{
		addFirst(val);
		return;
	}
	if(idx==size())
	{
		addLast(val);
		return;
	}
	Node nn=new Node();
	nn.val=val;
	Node temp=getAt(idx-1);
	nn.next=temp.next;
	temp.next=nn;
size++;
}
public void deleteAt(int idx)throws Exception
{
	if(idx<0||idx>=size)
	{
		throw new Exception("Invalid index");
	}
	if(idx==0)
	{
		removeFirst();
		return ;
	}
	if(idx==size()-1)
	{
		removeLast();
		return;
	}
	Node temp=getAt(idx-1);
	temp.next=temp.next.next;
size--;
}
public void reverse()
{
	Node temp=head;
	Stack<Node>s=new Stack();
	while(temp!=null)
	{
		s.push(temp);
		temp=temp.next;
	}
	temp=head;
	int lo=0;
	int hi=size()-1;
	while(!s.isEmpty())
	{
		Node rem=s.pop();
		if(lo<hi)
		{
	int val=temp.val;
	temp.val=rem.val;
	rem.val=val;
	temp=temp.next;
	
		}
		lo++;
		hi--;
}
	
}
public void reverseRec()
{
	reverseRec(head,head,0);
}
private Node reverseRec(Node root,Node head,int cnt)
{
	if(root==null)
	{
		return head;
	}
	Node res=reverseRec(root.next,head,cnt+1);
	if(cnt>size()/2)
	{
	int temp=res.val;
	res.val=root.val;
	root.val=temp;
	return res.next;
}
	return null;
}
class hlp{
	int size;
	Node head;
}
public void reverseRec2()
{
	hlp h=new hlp();
	h.head=head;
	reverseRec2(head,0,h);
}
private void reverseRec2(Node root,int cnt,hlp h)
{
	if(root==null)
	{h.size=cnt;
		return;
	}
	reverseRec2(root.next,cnt+1,h);
	if(cnt>=h.size/2)
	{
	int temp=h.head.val;
	h.head.val=root.val;
	root.val=temp;
	h.head=h.head.next;
}
}
public int mid()
{
	Node slow=head;
	Node fast=head.next;
	while(fast!=null&&fast.next!=null)
	{
		slow=slow.next;
		fast=fast.next.next;
	}
	return slow.val;
		
}
public void fold()
{
	fold(head,head,0);
}
private Node fold(Node root,Node head,int cnt)
{
	if(root==null)
	{
		return head;
	}
	Node res=fold(root.next,head,cnt+1);
	if(cnt>size/2)
	{
Node temp=res.next;
res.next=root;
root.next=temp;
return temp;
	}
	if(cnt==size/2)
	{
		root.next=null;
	return null;
	}
return root;
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
int cnt=size-1;
temp=head;
while(temp!=null)
{
	
	Node res=s.pop();
	Node next=temp.next;
if(cnt>size/2)
{
	
	
	temp.next=res;
	res.next=next;
}
if(cnt==size/2)
{
	res.next=null;
break;
}
	temp=next;
	cnt--;
}
}
public int KLast(int k)
{
	if(k<=0||k>size)
	{
		return -1;
	}
	Node fast=head;
	Node slow=head;
	int cnt=0;
	while(cnt<k)
	{
		fast=fast.next;
		cnt++;
	}
	while(fast!=null)
	{
		slow=slow.next;
		fast=fast.next;
	}
	return slow.val;
}
public int kLast2(int k)
{
	if(size<k)
	{
		return -1;
	}
	int gap=size-k;
	int cnt=0;
	Node temp=head;
	while(cnt<gap)
	{
		temp=temp.next;
		cnt++;
	}
	return temp.val;
}
public void reverseLink()
{
	Node prev=null;
	Node temp=head;
	while(temp!=null)
	{
		Node cur=temp.next;
		temp.next=prev;
		
		if(prev==null)
		{
			tail=temp;
		}
		prev=temp;
		temp=cur;
	}
	head=prev;
	
}
public Node mid(Node head)
{
	Node prev=head;
Node slow=head;
Node fast=head;
while(fast!=null&&fast.next!=null)
{prev=slow;
	slow=slow.next;
	fast=fast.next.next;
}
return prev;
	
}
public void sort()
{
	head=sort(head,tail);
}
private Node sort(Node head,Node tail)
{
	if(head.next==null)
	{
		Node nn=new Node();
		nn.val=head.val;
		return nn;
	}
	//this.tail=tail;
	
	Node mid=mid(head);
	Node temp=mid.next;
	mid.next=null;
	Node left=sort(head,mid);
	Node right=sort(temp,tail);
Node res=merge(left,right);
return res;
}
public Node merge(Node h1,Node h2)
{
    Node strt=null;
    Node prev=null;
    
    //ListNode x=nn;
   Node i=h1;
    Node j=h2;
    while(i!=null&&j!=null)
    {
        if(i.val>j.val)
        {
            Node nn=new Node();
            nn.val=j.val;
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
        else if(i.val<j.val)
        {
Node nn=new Node();
nn.val=i.val;
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
                Node nn=new Node();
                nn.val=i.val;
                i=i.next;
                if(prev==null)
                {
                    strt=nn;
                    prev=nn;
                }
                else{
                    prev.next=nn;
                    prev=nn;
                }
        }
    }
    if(i!=null)
    {
        prev.next=i;
    }
    if(j!=null)
    {
        prev.next=j;
    }
return strt;       
     }
}



