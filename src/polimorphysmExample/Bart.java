package polimorphysmExample;

public class Bart {

	private String name;

	public Bart(String name) {
		this.name = name;
	}
	
	public void sing(Ballada ballada){
		System.out.println(name + " is singing to you");
		ballada.singing();
	}
	
	public void sing(HeroBallada ballada){
		System.out.println(name + " is singing to you");
		ballada.singing();
	}
	
	public void sing(LoveBallada ballada){
		System.out.println(name + " is singing to you");
		ballada.singing();
	}
	
	public void sing(SimpleBallada ballada){
		System.out.println(name + " is singing to you");
		ballada.singing();
	}
}
