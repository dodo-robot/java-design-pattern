package bridge;

public class Rectangle extends Shape{
	
	private int length;

	private int breadth;


	public Rectangle(int length, int breadth, Color color) {
		super(color);
		this.length=length;
		this.breadth=breadth;
		this.shapeType="rectangle";
	}

	@Override
	public void computeArea() {
		this.area = this.breadth * this.length;
	}

}
