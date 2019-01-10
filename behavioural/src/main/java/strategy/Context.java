package strategy;

public class Context {
	
	private Strategy strategy;
	
	public Context(Strategy strategy) {
		this.setStrategy(strategy);
	} 

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public String doSomething() {
		return this.strategy.execute();
	}

}
