package state;

import java.util.HashMap;
import java.util.Map;

public class LightBulb {
	
	private Map<State, State> lightBulbStateMap;
	private State currentState;
	
	public LightBulb() {
		lightBulbStateMap = new HashMap<>();
		State onState = new OnState(this);
		State offState = new OffState(this);
		lightBulbStateMap.put(onState, offState);
		lightBulbStateMap.put(offState, onState);
		
		this.currentState = offState;
	}
	
	public void setCurrentState(State state) {
		this.currentState = state;
	}
	
	public void displayState() {
		this.currentState.displayState();
	}
	
	
	public void toggle() {
		this.currentState.transitionTo(lightBulbStateMap.get(currentState));
	}

}
