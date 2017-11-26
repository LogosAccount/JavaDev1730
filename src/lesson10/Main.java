package lesson10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		StringWithVersion st = new StringWithVersion("abc", 1);
		int[] array = {1, 2, 3};
		IntArrayWithVersion arrayWithVersion = new IntArrayWithVersion(array, 2);
	
		WithVersion<String> strWithVersion = new WithVersion<>("abc", 2);
		WithVersion<int[]> intArrayWithVersion = new WithVersion<int[]>(array, 3);
	
	
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter persons age:");
//		int age = sc.nextInt();
//		System.out.println("Enter persons name");
//		String name = sc.next();
//		System.out.println("Enter persons gender");
//		String gender = sc.next();
		
		Person p = new Person(22, "Petro", Gender.MALE);
		Person g = new Person(21, "Ivanka", Gender.FEMALE);
		
		p.getNailLength();
		g.getNailLength();
		
		System.out.println(p);
		
		Gender[] genders = Gender.values();
		
//		for (int i = 0; i < genders.length; i++) {
//			System.out.println(genders[i]);
//		}
	}

}
