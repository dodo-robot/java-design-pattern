package observer;

public class Main {

	public static void main(String[] args) {
		Subject radio = new RadioStation();
		
		Observer ob1 = new Person("Dodo");
		Observer ob2 = new Person("Mario");
		
		radio.registerObserver(ob1);		
		radio.registerObserver(ob2);

		radio.notifyObserver();
		
		Observer ob3 = new Person("Luca");
		Observer ob4 = new Person("Gigi");
		
		radio.registerObserver(ob3);
		radio.registerObserver(ob4);
		
		((RadioStation)radio).updateGoldenNUmber(6);
 		
		
	}

}
