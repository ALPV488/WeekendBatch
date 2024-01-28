package exception;

public class Exception3 {
	public static void main(String args[]) {
		try {
			int a[] = new int[5];// 0,1,2,3,4
			a[1] = 30 / 1;
			String s = "sai";
			int x = Integer.parseInt(s,29 );
			
			
			System.out.println(x);
			
			System.out.println(s.length());
			System.out.println("15.no error  " + a[1]);
		}catch (ArithmeticException e) {
			System.out.println("17.dont enter zero denominator");

		} catch (ArrayIndexOutOfBoundsException Ae) {
			System.out.println("20.index maximum size crossed");

		} catch (NumberFormatException e) {
			System.out.println("23.unable to convert string to number");
		} catch (Exception e) {
					System.out.println("25.not handled  " + e);}
				
				
		
		
	finally {	// it will print in any case
			System.out.println("31.executes every time for closing connections");
		}
		System.out.println("33.remaining code  executed...");

	}
}