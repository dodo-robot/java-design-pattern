package mediator;

public class ComponentB extends Component{
	
	public ComponentB(Mediator mediator) {
		super("Component-B", mediator);
	}

	@Override
	public void send() {
		String message = "I what's up";
		System.out.println("i'm Component-B trying to send: "+message);
		this.mediator.notify(this, message);
	}

	@Override
	public void recieve(String message) {
		System.out.println("component-B recieved: "+message);
	}

}
