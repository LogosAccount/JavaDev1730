package lesson9;

public class Rectangle implements Figure{

	private double sizeX;
	private double sizeY;
	
	public Rectangle(double sizeX, double sizeY) {
		this.sizeX = sizeX;
		this.sizeY = sizeY;
	}

	public double square() {
		return sizeX*sizeY;
	}

	@Override
	public double perimetr() {
		return 2*(sizeX + sizeY);
	}

}
