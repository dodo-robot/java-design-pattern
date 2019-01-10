package chain_of_responsability;

public class FireTruckHandler extends AbstractHandler{

	@Override
	public void handle(String incoming) {
		System.out.println("in FireTruckHandler");
		if(incoming.equalsIgnoreCase("FIRE_TRUCK")) {
			System.out.println("op1");
			System.out.println("op2");
			return;
		}

		this.nextHandler.handle(incoming);

	}

}

