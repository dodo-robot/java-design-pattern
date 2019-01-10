package proxy;

public class ServiceProxy implements ServiceInterface{
	
	private ServiceInterface actualService;
	
	public ServiceProxy() {
		this.actualService = new ActualService();
	}
	
	@Override
	public void singleOperation() {
		System.out.println("Going via proxy...");
		// what-ever checks you need to make
		
		// is data valid
		System.out.println("Proceed invocation Data validation complete");	
		actualService.singleOperation();
	}

}
