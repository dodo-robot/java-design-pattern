package facade;

public class ShapeMakerFacade {
	private ShapeSubSystem circle;
	private ShapeSubSystem square;
	private ShapeSubSystem rectangle;

	public ShapeMakerFacade() {
		this.circle = new Circle();
		this.rectangle = new Rectangle();
		this.square = new Square();
	}

	public void drawCircle() {
		this.circle.draw();

	}

	public void drawSquare() {
		this.square.draw();

	}

	public void drawRectangle() {
		this.rectangle.draw();

	}

}
