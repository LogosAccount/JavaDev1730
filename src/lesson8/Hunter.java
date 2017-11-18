package lesson8;

public class Hunter extends Human{
	
	private static int countOfHunters;
	
	public Hunter(int age, String name) {
		super(age, name);
		countOfHunters++;
	}
	
	public int getCountOfHunters(){
		return countOfHunters;
	}
	
	public void eatMeat(String meatName){
		System.out.println("Finally I get some " + meatName);
	}
	
	public void eatMeat(){
		run();
		System.out.println("Finally I get some meat");
	}

	
}
