package chain_of_responsability;

public class PoliceSuvHandler extends AbstractHandler{

	@Override
	public void handle(String incoming) {
		System.out.println("in PoliceSuvHandler");
		if(incoming.equalsIgnoreCase("POLICE_SUV")) {
			System.out.println("op1");
			System.out.println("op2");
			System.out.println("op3");
			System.out.println("op4");
			return;
		}
		throw new IllegalArgumentException("vehicle of type " + incoming +" is not valid");
		
	}

}

