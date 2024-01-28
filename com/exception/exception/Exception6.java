package exception;

class AgeNotValidException extends Exception {//pojo code

	private int age;
	
	public AgeNotValidException() {
		
	}

	public AgeNotValidException(int age) {
		this.age = age;
	}

//	public String toString() {
//		return "you are not eligable for vote  :" + age;
//	}
}

public class Exception6 {

	static void validation(int age) throws AgeNotValidException {

		if (age < 18) // below 18
		{
			throw new AgeNotValidException();
		}

		else { // above 18

			System.out.println("you are eligable to vote");
		}
	}

	public static void main(String args[]) {
		try {
			validation(9);}
		catch(AgeNotValidException e) {
			System.out.println(e);
		}

	
		System.out.println("rest of the code...");
	}
}
