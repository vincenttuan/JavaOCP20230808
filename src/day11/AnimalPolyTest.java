package day11;

public class AnimalPolyTest {

	public static void main(String[] args) {
		// Animal 多型應用
		Animal cat = new Cat();
		Animal dog = new Dog();
		Dog    dog2 = new Dog();
		cat.sound();
		dog.sound();
		dog2.sound();
		
		Animal[] animals = {cat, dog, dog2};
		for(Animal animal : animals) {
			animal.sound();
		}
		
		displayAnimalSound(cat);
		displayAnimalSound(dog);
		displayAnimalSound(dog2);
	}
	
	public static void displayAnimalSound(Animal animal) {
		animal.sound();
	}

}
