package memento;

import java.util.ArrayList; 

public class CareTaker {
	
	private ArrayList<Memento> history; // = new ArrayList<Memento>();
	private int currState = -1;
	
	public CareTaker() {
		 history = new ArrayList<Memento>();
	}
	
	public  void addMemento(Memento m) {
		history.add(m);
		currState = history.size() - 1;
	}
	
	public  Memento getMemento(int index) { 
		return history.get(index);
	}
	
	public Memento undo() {
		System.out.println("undoing state");
		if(currState<=0) {
			currState=0;
			return getMemento(currState);
		}
		
		currState--;
		return getMemento(currState);
	}
	
	
	public Memento redo() {
		System.out.println("redoing state");
		if(currState > history.size() - 1 ) {
			currState = history.size() - 1;
			return getMemento(currState);
		}
		currState++;
		return getMemento(currState);
		 
	}
}
