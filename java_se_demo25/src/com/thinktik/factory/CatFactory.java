package com.thinktik.factory;

public class CatFactory implements Factory {

	@Override
	public Animal createAnimal() {

		return new Cat();
	}

}
