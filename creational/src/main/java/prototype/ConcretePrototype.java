package prototype;

public class ConcretePrototype implements Prototype{
	
	private String name; 
	
	
	public ConcretePrototype(String name){
		this.name = name;
	}
	
	public ConcretePrototype(ConcretePrototype prototype){
		this.name = prototype.name;
	}
	
	@Override
	public Prototype clone() {
		return new ConcretePrototype(this);
	}
	
	public String getName() {
		return this.name;
	}
	
	
 
}
