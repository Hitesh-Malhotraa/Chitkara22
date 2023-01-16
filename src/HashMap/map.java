package HashMap;
import java .util.HashMap;
public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {10,9,30,40,10,10,30};
		HashMap<Integer,Integer>map=new HashMap();
	for(int i=0;i<arr.length;i++)
	{
		if(map.containsKey(arr[i]))
		{
			int val=map.get(arr[i]);
			map.put(arr[i], val+1);
		}
		else {
			
		
		map.put(arr[i], 1);
	}
		
	}
	System.out.println(map);
	
	}
//	@Override
//	public String toString()
//	{
//		return new String("Padh lo");
//	}

}
