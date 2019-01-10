package bridge;

public class Main {

	public static void main(String[] args) {
		Color red = new RedColor();
		Color green = new GreenColor();
		Shape square = new Square(4, red);
		square.paintShape();
		
		Shape rectangle = new Rectangle(6,4, green);
		rectangle.paintShape();

		//		 ...you can change color behaviour at runtime
		square.setColor(green);
		square.paintShape();


	}

}
