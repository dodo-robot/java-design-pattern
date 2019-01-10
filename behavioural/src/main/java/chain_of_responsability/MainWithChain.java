package chain_of_responsability;

public class MainWithChain {

	public static void main(String[] args) {
		MainWithChain demo = new MainWithChain();
		Handler vehicleHandler = demo.getValidationHandlers();
		String vehicleType = "POLICE_SUV";
		vehicleHandler.handle(vehicleType);  
	}

	private Handler getValidationHandlers() {
		AbstractHandler ambulanceHandler = new AmbulanceHandler();
		AbstractHandler civilianHandler = new CivilianSuvHandler();
		AbstractHandler fireTruckHandler = new FireTruckHandler();
		AbstractHandler policeSuvHandler = new PoliceSuvHandler();

		civilianHandler.setNextHandler(fireTruckHandler);
		fireTruckHandler.setNextHandler(ambulanceHandler); 
		ambulanceHandler.setNextHandler(policeSuvHandler);
		
		return civilianHandler;
	}

}
