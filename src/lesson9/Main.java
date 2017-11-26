package lesson9;

import polimorphysmExample.Bart;
import polimorphysmExample.HeroBallada;
import polimorphysmExample.LoveBallada;
import polimorphysmExample.SimpleBallada;

public class Main {

	public static void main(String[] args) {
		Bart lutik = new Bart("Lutik");
		lutik.sing(new HeroBallada());
		lutik.sing(new LoveBallada());
		lutik.sing(new SimpleBallada());
		
		
		Animal cat = new Cat();
		cat.breath();
		
		Figure[] figures = {new Circle(3),
							new Rectangle(3, 4),
							new Circle(8)};
		
		for (int i = 0; i < figures.length; i++) {
			System.out.println(figures[i].square());
			System.out.println(figures[i].perimetr());
		}
	}

}
