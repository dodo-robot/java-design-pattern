package prototype;

public class Main {
	
	public static void main(String args[]) {
		ConcretePrototype original = new ConcretePrototype("Test Name");
		PrototypeRegistry registry = new PrototypeRegistry();
		registry.addPrototypeToRegistry("Original", original);
		
		ConcretePrototype clone = (ConcretePrototype) registry.getPrototypeCloneFromRegistry("Original"); 
		
		System.out.println(original);
		System.out.println(clone);
		
		System.out.println(original.getName());
		System.out.println(clone.getName());
	}

}
