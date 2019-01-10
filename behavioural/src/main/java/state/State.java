package state;

public interface State {
	
	public void transitionTo(State state);
	
	public void displayState();

}
