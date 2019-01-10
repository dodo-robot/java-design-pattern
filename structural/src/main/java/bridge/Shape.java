package bridge;

public abstract class Shape {
	
	protected int area;
	protected String shapeType;
	protected Color color;
	
	public Shape(Color color){
		this.color=color;
	}

	public int getArea() {
		return this.area;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract void computeArea();
	
	public void paintShape() {
		System.out.println("Pinting "+this.shapeType+""+color.fillColor());
	}
	
}
