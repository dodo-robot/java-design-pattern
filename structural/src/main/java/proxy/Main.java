package proxy;

public class Main {

	public static void main(String[] args) {
		ServiceInterface proxy = new ServiceProxy();
		proxy.singleOperation();
	}

}
