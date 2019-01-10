package observer;

public class Person implements Observer{

	private String name;

	public Person(String name) {
		this.name=name;
	}

	@Override
	public void notifyMe(int i) {
		System.out.println(this.name + " got notified. the Golden Number is "+ i);		
	}

}
