package com.inu.designpetterns.factory;

public class Cat implements Animal{

	@Override
	public String name() {
		return "Cat";
		
	}

	@Override
	public String eat() {
		return "Fish";
	}

}
