package Avl;
import java.util.*;
public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>list=new ArrayList();
list.add(1);
list.add(2);
list.add(3);
list.add(4);
//System.out.println(list);

int i=0;
int j=list.size()-1;
while(i<j)
{
int temp=list.get(i);
list.set(i,list.get(j));
list.set(j,temp);

i++;
j--;

}
System.out.println(list);
}
}