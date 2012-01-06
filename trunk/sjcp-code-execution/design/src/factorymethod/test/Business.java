package factorymethod.test;

import factory.animal.Animal;
import factorymethod.animal.MethodFactory;

public class Business {
	public void displayAnimalCases(String[] animalFolk){
		MethodFactory factory ;
		for (String animalType : animalFolk){
			factory = MethodFactory.getFactory(animalType);
			Animal animal = factory.layAnimal();
			System.out.println(animal.sound());
		}
	}
}
