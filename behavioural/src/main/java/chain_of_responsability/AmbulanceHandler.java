package chain_of_responsability;

public class AmbulanceHandler extends AbstractHandler{

	@Override
	public void handle(String incoming) {
		System.out.println("in AmbulanceHandler");

		if(incoming.equalsIgnoreCase("AMBULANCE")) {
			System.out.println("op1");
			return;
		}


		this.nextHandler.handle(incoming);
		

	}

}
