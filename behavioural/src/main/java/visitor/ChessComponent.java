package visitor;

public abstract class ChessComponent {
	
	private String color;
	private String componentName;
	
	public ChessComponent(String componentName, String color) {
		this.componentName = componentName;
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
 
	public String getComponentName() {
		return componentName;
	}
	
	public abstract void accept(Visitor v);
	

}
