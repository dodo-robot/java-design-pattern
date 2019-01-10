package mediator;

public class ComponentA extends Component{

	public ComponentA(Mediator mediator) {
		super("Component-A", mediator);
	}

	@Override
	public void send() {
		String message = "I am good";
		System.out.println("i'm Component-A trying to send: "+message);
		this.mediator.notify(this, message);
	}

	@Override
	public void recieve(String message) {
		System.out.println("component-A recieved: "+message);
	}

}
