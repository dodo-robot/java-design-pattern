package proxy;

public class ActualService implements ServiceInterface{

	@Override
	public void singleOperation() {
		System.out.println("invoking really bad heavy operation.");
	}

}
