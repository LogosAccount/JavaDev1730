package lesson7;

import static lesson7.Person.walk;

public class Main {
	
	public static void main(String[] args) {
		Person person = new Person();
		walk(0);
		
		Person person2 = new Person(20, "Nazar");
		walk(5);
		
		System.out.println(person);
		System.out.println(person2);
	}

}
