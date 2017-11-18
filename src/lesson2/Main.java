package lesson2;

public class Main {

	public static void main(String...args){
		/**/
		//byte byteNumber1, byteNumber2;
		byte byteNumber;
		byteNumber = 3;
		char charNumber = '\u0041';
		short shortNumber = 5;
		int intNumber1 = 4;
		int intNumber2 = 6;
		
		intNumber2 = intNumber2 + 12;
		intNumber2 += 12;
		intNumber2++;
		intNumber2--;
		long longNumber = 10L;
		float floatNumber = 0.5f;
		double doubleNumber = 0.0;
		boolean isTrue = true; //false
		String s1 = "abc";
		
//		float intNumber3 = intNumber1 * floatNumber;
		System.out.println(intNumber1 * floatNumber);
		
		// ==, >, <, >=, <=, !=
		
		int check = 6;
		if(check != 5){
			System.out.println("Hello World!");
		} else {
			System.out.println(check + " is not 5");
		}
		
		for(int index = 0; index < 10; index++){
			System.out.println(index);
		}
		
		int newNumber = 13;
		System.out.println(newNumber % 3);
		
	}
}
