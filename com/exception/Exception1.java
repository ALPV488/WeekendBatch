package exception;


import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the numerator:-");

		int fnum = scan.nextInt();

		System.out.println("Enter the denominator:-");

		int Snum = scan.nextInt();
		try {

		int result = (fnum / Snum);

		System.out.println("The result is:-" + result);
		}
//		catch(ArithmeticException e) {
//		System.out.println("Don't enter zero as the denominator ");
//		}
		
		finally {
			System.out.println("29.The remaining 10.Cr line of code");
		}
		
		
		System.out.println("33.The remaining 10.Cr line of code");
	}

}
