package chain_of_responsability;

public class Main {

	public static void main(String[] args) {
		String incomingSuspect = "CIVILIAN_SUV";

		if(incomingSuspect.equalsIgnoreCase("CIVILIAN_SUV")) {
			System.out.println("op1");
			System.out.println("op2");
			System.out.println("op3");
		}
		else if(incomingSuspect.equalsIgnoreCase("FIRE_TRUCK")) {
			System.out.println("op1");
			System.out.println("op2");
		}
		else if(incomingSuspect.equalsIgnoreCase("AMBULANCE")) {
			System.out.println("op1");
		}
		else if(incomingSuspect.equalsIgnoreCase("POLICE_SUV")) {
			System.out.println("op1");
			System.out.println("op2");
			System.out.println("op3");
			System.out.println("op4");
		}else {
			System.out.println("end");
		}

	}

}
