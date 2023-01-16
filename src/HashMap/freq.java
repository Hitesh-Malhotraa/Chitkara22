package HashMap;

import java.util.*;

public class freq {

	public static void main(String args[])
{
	HashMap<Integer,Integer>map=new HashMap();
	int arr[]= {1,8,7,3,4,5,3,2};

	for(int i=0;i<arr.length;i++)
	{
		map.put(arr[i], 1);
	}
	int ans=0;
	HashSet<Integer>set=new HashSet();
	for(int val:map.keySet())
	{
		if(set.contains(val))
		{
			continue;
		}
		else {
			set.add(val);
			int cnt=1;
			while(map.containsKey(val+1))
			{
				set.add(val);
				cnt+=1;
			val++;
			}
			ans=Math.max(cnt, ans);
		}
		
	}
	System.out.println(ans);
}
}
