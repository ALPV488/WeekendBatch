package exception;

public class Throws {
	
	public void division(int a,int b) throws ArithmeticException
	{
		int  result = a/b;
		
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		
		Throws obj = new Throws();//obj creation
		
		try {
		
		obj.division(4,0);}
		
		catch(ArithmeticException e) {
			System.out.println("12"+e);
		}
		
		
	}

}
