package com.inu.designpetterns.factory;

public class AnimalPatternTest {

	public static void main(String[] args) {
		
		Animal cat = AnimalFactory.getAnimal(Animals.CAT);
		System.out.println(cat.name() + " eats " + cat.eat());

		Animal dog = AnimalFactory.getAnimal(Animals.DOG);
		System.out.println(dog.name() + " eats " + dog.eat());
	}

}
