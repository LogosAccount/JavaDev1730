package lesson7;

public class Person extends Object{
	
	int age;
	String name;
	
	Person()	{
		
	}
		
	Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public static void walk(int distance){
		System.out.println("Hi my name is " 
							+ name + " and I just walked " 
							+ distance + "km" );
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
	
	
}
