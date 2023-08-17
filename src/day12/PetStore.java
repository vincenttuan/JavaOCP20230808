package day12;

public class PetStore {

	public static void main(String[] args) {
		System.out.printf("寵物店名: %s\n", Pet.companyName);
		Pet p1 = new Dog();
		Pet p2 = new Cat();
		Pet p3 = new EDog();
		p1.eat();
		p2.eat();
		p3.eat();
		p1.skill();
		p2.skill();
		p3.skill();
		
		Pet[] pets = {p1, p2, p3};
		for(Pet pet : pets) {
			pet.eat();
			pet.skill();
		}
	}

}
