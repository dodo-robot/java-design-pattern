package chain_of_responsability;

public abstract class AbstractHandler implements Handler{
	protected Handler nextHandler;
	
	public void setNextHandler(Handler nextHandler) {
		this.nextHandler=nextHandler;
	}
	
}
