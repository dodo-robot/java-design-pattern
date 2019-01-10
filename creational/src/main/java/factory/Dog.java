package factory;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println("Woof Woof...");	
	}

	@Override
	public void makeAround() {
		System.out.println(this.getName() + " is moving around....");
	}

}
