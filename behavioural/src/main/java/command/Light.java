package command;

public class Light extends Reciever{

	public Light(String name) {
		super(name);
 	}

	@Override
	public void on() {
		System.out.println("the light is on!");
		
	}

	@Override
	public void off() {
		System.out.println("the light is off!");
		
	}

}
