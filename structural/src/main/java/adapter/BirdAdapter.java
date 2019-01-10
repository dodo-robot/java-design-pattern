package adapter;

public class BirdAdapter implements Bird{

	private PlasticToyBird toyBird;

	public BirdAdapter(PlasticToyBird toyBird){
		this.toyBird=toyBird;
	}

	@Override
	public void makeSound() {
		toyBird.squeak();

	}

}
