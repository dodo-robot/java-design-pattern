package mediator;

public abstract class Component {
	
	private String name;
	protected Mediator mediator;
	
	public Component(String name, Mediator mediator){
		this.setName(name);
		this.mediator=mediator;
	}
	
	public abstract void send();
	
	public abstract void recieve(String message);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
