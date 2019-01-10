package factory;

public class PetStore {

	private AnimalFactory factory;

	public PetStore(AnimalFactory factory) {
		this.factory = factory;
	} 

	public  Animal orderPet(String petName, String petType) { 
		return this.factory.createAnimal(petName, petType);
	} 

}
