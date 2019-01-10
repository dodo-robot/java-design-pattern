package factory;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println("Meow Meow...");	
	}

	@Override
	public void makeAround() {
		System.out.println(this.getName() + " is moving around....");
	}

}
