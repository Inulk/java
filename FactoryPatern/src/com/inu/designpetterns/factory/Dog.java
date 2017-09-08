package com.inu.designpetterns.factory;

public class Dog implements Animal{

	@Override
	public String name() {
		return "Dog";
	}

	@Override
	public String eat() {
		return "Meat";
	}

}
