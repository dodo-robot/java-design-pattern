package memento;

public class Main {

	public static void main(String[] args) {
		Originator originator = new Originator();
		CareTaker careTake = new CareTaker();
		
		originator.setArticle("state 1");
		careTake.addMemento(originator.save());
		printState(originator);
		
		originator.setArticle("state 2");
		careTake.addMemento(originator.save());
		printState(originator);
		
		originator.setArticle("state 3");
		careTake.addMemento(originator.save());
		printState(originator);
		
		originator.setArticle("state 4");
		careTake.addMemento(originator.save());
		printState(originator);
		
		originator.restore(careTake.undo());
		printState(originator);
		originator.restore(careTake.undo());
		printState(originator);
		originator.restore(careTake.undo());
		printState(originator);
		originator.restore(careTake.redo());
		printState(originator);
		originator.restore(careTake.redo());
		printState(originator);

	}

	private static void printState(Originator originator) {
		System.out.println(originator.getArticle());
	}

}
