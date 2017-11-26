package lesson9;

public abstract class Animal {

	public void breath(int breathPeriod){
		System.out.println("I`m breathing with period" + breathPeriod);
	}
	
	public abstract void breath();
}
