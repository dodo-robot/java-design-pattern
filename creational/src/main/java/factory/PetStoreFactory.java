package factory;

public class PetStoreFactory implements AnimalFactory{

	public Animal createAnimal(String petName, String petType) {
		Animal pet;

		if(petType.equalsIgnoreCase("Dog")) {
			pet = new Dog(petName);
		}
		else if(petType.equalsIgnoreCase("Cat")) {
			pet = new Cat(petName);
		}
		else {
			throw new IllegalArgumentException(petType + " is not a valid category!"); 
		}
		return pet;
	}

}
