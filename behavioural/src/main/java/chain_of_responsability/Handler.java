package chain_of_responsability;

public interface Handler {
	public void handle(String incoming);
	
	public void setNextHandler(Handler nextHandler);
}
