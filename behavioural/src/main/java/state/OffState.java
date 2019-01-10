package state;

public class OffState implements State{

	private LightBulb bulb;

	public OffState(LightBulb bulb) {
		this.bulb = bulb;
	}

	@Override
	public void transitionTo(State state) {
		this.bulb.setCurrentState(state);
	}

	@Override
	public void displayState() {
		System.out.println("light bulb is turn off");

	}

}
