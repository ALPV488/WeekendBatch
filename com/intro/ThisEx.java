public class ThisEx {

	public ThisEx() {		//default constr
		this("apple");										//  1  parmet contr calling
	}

	public ThisEx(String name) {
		this("rose","tulips");								// 2 parms contr calling
		System.out.println(name);
	}

	public ThisEx(String name, String name1) {
		 this("orange","banana","grapes");			//3 parms contr calling
		 System.out.println(name +'\t'+name1);
	}

	public ThisEx(String name, String name1, String name2) {
		this("marigold","tulips","rose","pink");			//4 parms contr calling
		System.out.println(name +'\t'+name1+'\t'+name2);

	}

	public ThisEx(String name, String name1, String name2, String name3) {
		System.out.println(name +'\t'+name1+'\t'+name2+'\t'+name3);		//prints
	}
	
	public static void main(String[] args) {
		
		ThisEx obj = new ThisEx();					//constr calling 
	}

}
