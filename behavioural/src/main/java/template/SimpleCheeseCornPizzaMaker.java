package template;

public class SimpleCheeseCornPizzaMaker extends PizzaMaker{

	@Override
	public void selectBread() {
		System.out.println("bread selected...");		
	}

	@Override
	public void chooseIngredients() {
		System.out.println("choose ingredients...");		

	}

	@Override
	public void addTopping() {
		System.out.println("adding toppings...");		

	}

	@Override
	public void addCheese() {
		System.out.println("adding cheese...");		

	}

	@Override
	public void bakeAtTemp() {
		System.out.println("bake pizza at 180 degrees...");		

	}

}
