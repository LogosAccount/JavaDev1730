package lesson9;

public class Circle implements Figure{

	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double square() {
		return PI*radius*radius;
	}

	@Override
	public double perimetr() {
		return 2*PI*radius;
	}

}
