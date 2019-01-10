package builder;

public class Main {
	
	public static void main(String[] args) {
		RobotBuilder builder = new HumanoidRobotBuilder();
		builder.initBot();
		builder.assembleArms();
		builder.assembleHeads();
		builder.assembleLegs();
		builder.assembleSensors();
		
		Robot sofia = builder.build(); 
	}

}
