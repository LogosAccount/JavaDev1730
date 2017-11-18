package lesson5;

public class Main {

	public static void main(String[] args) {
		
		MyString st = new MyString();
		
		
		compareTo("jhbd");
		
		//Java5
//		System.out.println(s1.hashCode());
//		s1 = s1 + "5";
//		String s2 = "Java";
//		String s3 = new String("Java");
//		
		StringBuffer sbuf = new StringBuffer();
		sbuf.append("Hello ");
		sbuf.reverse();
//		sbuf.append("World");
//		System.out.println(sbuf);
//		StringBuilder sbuild = new StringBuilder();
//		
//		System.out.println(s1 == s2);
//		System.out.println(s1 == s3);
//		System.out.println(s1.equals(s3));
		
		String s1 = "Java"; 
		String s2 = new String("Java");
		System.out.println(s1.charAt(1));
		System.out.println(s1.codePointAt(1));
//		System.out.println(s1.codePointCount(2, 7));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.contains("Jaga"));
		System.out.println(s1.endsWith("Ja"));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.indexOf("a"));
		System.out.println(s1.intern() == s2.intern());
		System.out.println(s1.isEmpty());
		
		String file = "file.txt";
		
		System.out.println(
				file.substring(
						file.lastIndexOf("."), file.length()
						));
		
		System.out.println(s1.substring(0, 3));
	
		
	}
	
	public static int compareTo(String s){
		return -1;
	}
}
