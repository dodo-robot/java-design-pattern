package chain_of_responsability;

public class CivilianSuvHandler extends AbstractHandler{

	@Override
	public void handle(String incoming) {
		System.out.println("in CivilianSuvHandler");

		if(incoming.equalsIgnoreCase("CIVILIAN_SUV")) {
			System.out.println("op1");
			System.out.println("op2");
			System.out.println("op3");
			return;
		}

		this.nextHandler.handle(incoming);
	}

}

