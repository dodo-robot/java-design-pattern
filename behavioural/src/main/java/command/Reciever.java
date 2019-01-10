package command;

public abstract class Reciever {
	
	private String name;
	
	public Reciever(String name){
		this.name = name;
	}

	public abstract void on();

	public abstract void off();

}
