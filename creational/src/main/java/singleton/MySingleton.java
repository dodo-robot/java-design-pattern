package singleton;

public class MySingleton {

	private static MySingleton instance=null;
	private int value;

	private MySingleton(int value) {
		this.setValue(value);
	}

	public static MySingleton getInstance(int value) {
		if(instance==null)
			instance = new MySingleton(0);
		return instance;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}


}
