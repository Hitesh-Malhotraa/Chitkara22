 package Interface;
import Recursion.subset2;
public class Bike  implements vechile{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vechile v=new Bike();
		System.out.println(v.numberOfTyres());
		v.color();
	}

	@Override
	public void typeOfEngine() {
		// TODO Auto-generated method stub
		System.out.println("Petrol");
	}

	@Override
	public int numberOfTyres() {
		// TODO Auto-generated method stub
		return 2;
	}
	public void color()
	{
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
