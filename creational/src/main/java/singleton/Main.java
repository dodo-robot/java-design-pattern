package singleton;

public class Main {
	public static void main(String[] args) {
		
		MyEnumSingleton singleton1 = MyEnumSingleton.INSTANCE;
		System.out.println("set value of 4 on singleton1 ");
		singleton1.setValue(4);
		System.out.println("singleton1 "+ singleton1.getValue());
		MyEnumSingleton singleton2 = MyEnumSingleton.INSTANCE;
		System.out.println("singleton2 "+ singleton2.getValue());
		System.out.println("set value of 8 on singleton1 ");
		singleton1.setValue(8);
		System.out.println("singleton2 "+ singleton2.getValue());
		System.out.println("singleton1 "+ singleton1.getValue()); 
		
	}
}
