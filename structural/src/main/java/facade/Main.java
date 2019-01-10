package facade;

public class Main {

	public static void main(String[] args) {
		ShapeMakerFacade shaper = new ShapeMakerFacade();
		shaper.drawCircle();
		shaper.drawRectangle();
		shaper.drawSquare(); 
	}

}
