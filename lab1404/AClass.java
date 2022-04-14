package practice;

public class AClass {

	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 100;
	}
	public static void main(String[] args) {
	
		AClass a1=new AClass();
		
		AClass a2=new AClass();
		
		if(a1.equals(a2))
		{
			System.out.println(true);
		}
		
		else
		{
			System.out.println("false");
		}

	}

}




/*

output:


false


*/
