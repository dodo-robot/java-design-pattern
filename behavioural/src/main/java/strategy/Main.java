package strategy;

public class Main {
	
	private Context context;
	
	public Main(Context context) {
		this.context = context;
	}

	public static void main(String[] args) {
		Context context = new Context(new BubbleSortStrategy());
		Main demo = new Main(context);
		demo.execute(); 
	}

	private void execute() {
		System.out.println(context.doSomething());
		context.setStrategy(new MergeSortStrategy());
		System.out.println(context.doSomething());
	}

}
