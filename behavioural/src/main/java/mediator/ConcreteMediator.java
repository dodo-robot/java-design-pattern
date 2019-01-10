package mediator;

import java.util.HashMap;
import java.util.Map;

public class ConcreteMediator implements Mediator{
	
	private static final String COMPONENT_A = "Component-A";
	private static final String COMPONENT_B = "Component-B";
	
	private Map<String, Component> regCompMap = new HashMap<String, Component>();

	
	@Override
	public void notify(Component component, String message) {
		if(component.getName().equalsIgnoreCase(COMPONENT_A)) {
			this.reactOnA(message);
		}else if(component.getName().equalsIgnoreCase(COMPONENT_B)){
			this.reactOnB(message);
		}
		
	}

	@Override
	public void register(Component component) {
		regCompMap.put(component.getName(), component);
		
	}
	
	
	private void reactOnA(String message) {
		regCompMap.get(COMPONENT_B).recieve(message);
	}
	
	private void reactOnB(String message) {
		regCompMap.get(COMPONENT_A).recieve(message); 
	}

}
