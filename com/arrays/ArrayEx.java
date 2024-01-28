package arrays;

public class ArrayEx {

	public static void main(String args[]) {

		int[] arrname = { 1, 2, 3, 4, 5, 5, 6, 7 };

		int[] arrname1 = new int[10];

		arrname1[0] = 12;

		int arrname2[] = new int[] { 1, 2, 3, 4, 5, 5, 6, 7 };
		
		for(int i = 0;i<arrname.length;i++) {
		System.out.print(arrname[i]);
		}
		
		System.out.println();
		System.out.println("After for each loop");
		
		for(int x :arrname) {
			System.out.print(x);
		}
		

	}

}
