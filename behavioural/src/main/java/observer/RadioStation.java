package observer;

import java.util.ArrayList;
import java.util.List;

public class RadioStation implements Subject{
	
	private List<Observer> myObserver;
	private int goldenNumber = 2;
	
	public RadioStation(){
		this.myObserver = new ArrayList<Observer>();
	}
 

	@Override
	public void registerObserver(Observer o) {
		myObserver.add(o);
	}


	@Override
	public void removeObserver(Observer o) {
		myObserver.remove(o);
	}


	@Override
	public void notifyObserver() {
		myObserver.forEach(observer -> {
			observer.notifyMe(goldenNumber);
		});
	}
	
	public void updateGoldenNUmber(int i) {
		this.goldenNumber=i;
		notifyObserver();
	}
	

}
