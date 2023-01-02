package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset2 {

	public static void main(String args[])
	{
	int arr[]= {1,2,2};
	System.out.println((arr));
	}
	public static List<List<Integer>> subsetsWithDup(int[] nums) {
	    Arrays.sort(nums);
	    return sol(nums,0,new ArrayList(),false);
	        }
	public static List<List<Integer>>sol(int arr[],int idx,List<Integer>list,boolean flag)
	{
	    if(idx>=arr.length)
	    {
	        List<List<Integer>>br=new ArrayList();
	        List<Integer>ans=new ArrayList(list);
	        br.add(ans);
	        return br;
	    }
	     List<List<Integer>>mr=new ArrayList();
	    if(flag==true&&arr[idx-1]==arr[idx])
	    {
	        List<List<Integer>>skip=sol(arr,idx+1,list,true);
	    for(List<Integer>l:skip)
	    {
	        mr.add(l);
	    }
	        return mr;
	    }
	    list.add(arr[idx]);
	    List<List<Integer>>take=sol(arr,idx+1,list,false);
	     list.remove(list.size()-1);
	    List<List<Integer>>skip=sol(arr,idx+1,list,true);
	   
	  
	    for(List<Integer>l1:take)
	    {
	        mr.add(l1);
	    }
	    for(List<Integer>l2:skip)
	    {
	        mr.add(l2);
	    }
	    return mr;
	}
	}
