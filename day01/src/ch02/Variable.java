package ch02;

public class Variable {

	//class variable
	int a;
	
	public static void main(String[] args) {
		//local variable
		int a = 100;
		
		int result;
		result = a + 50;
		System.out.println(result);
		
		int b = 30;
		int result2 = b * 10;
		System.out.println(result2);
	}

}
