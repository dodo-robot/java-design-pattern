package command;

public class Motor extends Reciever{

	public Motor(String name) {
		super(name);
 	}

	@Override
	public void on() {
		System.out.println("the motor is on!");
		
	}

	@Override
	public void off() {
		System.out.println("the motor is off!");
		
	}

}
