package com.inu.designpetterns.factory;

public class AnimalFactory {

	public static Animal getAnimal(Animals animal){
	
		if (animal.equals(Animals.CAT)) {
			return new Cat();
		}else if (animal.equals(Animals.DOG)) {
			return new Dog();
		}else{
			return null;
		}
	}
	
}
