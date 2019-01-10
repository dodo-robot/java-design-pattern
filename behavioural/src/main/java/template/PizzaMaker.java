package template;

public abstract class PizzaMaker {
	
	public abstract void selectBread();
	
	public abstract void chooseIngredients();
	
	public abstract void addTopping();
	
	public abstract void addCheese();
	
	public abstract void bakeAtTemp();


	
	public void make() {
		selectBread();
		chooseIngredients();
		addTopping();
		addCheese();
		bakeAtTemp();
	}

}
