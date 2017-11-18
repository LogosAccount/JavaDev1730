package lesson6;

public class Main {

	public static void main(String[] args) {
		String palindrome = "jAva";
		String second = "java";
		
		System.out.println(palindrome.compareTo(second));
		
		checkPalindrome(palindrome);
		
		String newLine = removeSymbols(palindrome, "то");
		System.out.println(newLine);
		
	}

	private static String removeSymbols(String p, String toDel) {
		while(p.indexOf(toDel) != -1){
			p = p.substring(0, p.indexOf(toDel)) + 
			p.substring(p.indexOf(toDel) + toDel.length(), p.length());
		}
		return p;
	}

	private static void checkPalindrome(String palindrome) {
		StringBuilder sb = new StringBuilder(palindrome);
		String reversedPalindrome = sb.reverse().toString();
		System.out.println(palindrome.equalsIgnoreCase(reversedPalindrome));
	}
	
	
}
