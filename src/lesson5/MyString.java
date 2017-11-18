package lesson5;

public class MyString {

	public static void main(String[] args) {
		String palindrom = "ротоj";
		boolean checkResult = checkPalindrome(palindrom);
//		System.out.println(checkResult);
		System.out.println(remove(palindrom, "то"));
	}
	
	static String remove(String palindrom, String removeSymbols) {
		while(palindrom.indexOf(removeSymbols) != -1){
			palindrom = palindrom.substring(0, palindrom.indexOf(removeSymbols)) 
					+ palindrom.substring(palindrom.indexOf(removeSymbols) + removeSymbols.length(), palindrom.length());
		}
		return palindrom;
	}

	static boolean checkPalindrome(String palindrom){
		if(palindrom.length() != 5){
			System.out.println("");
		}
		StringBuilder sb = new StringBuilder(palindrom);
		String reversedString = sb.reverse().toString();
		return palindrom.equalsIgnoreCase(reversedString);
	}
	
	
	
}
