package factory;

public class Main {
	 
	public static void main(String args[]) { 
		PetStore store = new PetStore(new PetStoreFactory());
		Animal pet = store.orderPet("Dollar", "Dog");
		pet.makeSound();
		pet.makeAround(); 
	}

}
