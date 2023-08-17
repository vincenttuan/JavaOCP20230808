package day11;

public class AnimalPolyTest {

	public static void main(String[] args) {
		// Animal 多型應用
		Animal cat = new Cat();
		Animal dog = new Dog();
		cat.sound();
		dog.sound();
		
		Animal[] animals = {cat, dog};
		for(Animal animal : animals) {
			animal.sound();
		}
		
		displayAnimalSound(cat);
		displayAnimalSound(dog);
		
	}
	
	public static void displayAnimalSound(Animal animal) {
		animal.sound();
	}

}
