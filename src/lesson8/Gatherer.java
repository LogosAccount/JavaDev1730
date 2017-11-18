package lesson8;

import java.util.Scanner;

public class Gatherer extends Human{

	Scanner sc;
	
	 String surname;
	
	public Gatherer(int age, String name, String surname) {
		super(age, name);
		this.surname = surname;
	}

	public void run(boolean getParentsMethod) {
		if(getParentsMethod){
			run();
		}else {
			System.out.println("Why should I run, I am gatherer");
		}
	}

}
