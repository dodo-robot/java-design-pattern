package state;

public class OnState implements State{

	private LightBulb bulb;

	public OnState(LightBulb bulb) {
		this.bulb = bulb;
	}

	@Override
	public void transitionTo(State state) {
		this.bulb.setCurrentState(state);
	}

	@Override
	public void displayState() {
		System.out.println("light bulb is turn on");

	}

}
