package builder;

public class HumanoidRobotBuilder implements RobotBuilder{

	private Robot robot; 

	public HumanoidRobotBuilder(){}


	@Override
	public void assembleArms() {
		this.robot.setArms("setting arms"); 
	}

	@Override
	public void assembleHeads() {
		this.robot.setHead("settigns head");
	}

	@Override
	public void assembleDoors() {
		this.robot.setDoors("no door required for humanoid");
	}

	@Override
	public void assembleWheels() {
		this.robot.setWheels("no wheels required for humanoid");
	}

	@Override
	public void assembleSensors() {
		this.robot.setSensors("no sensors required for humanoid");
	}

	@Override
	public void assembleFireAlarm() {
		this.robot.setFireAlarm("no fire alarm required for humanoid");
	}

	@Override
	public void assembleLegs() {
		this.robot.setLegs("settings legs");
	}

	@Override
	public Robot build() {
		return robot;
	}


	@Override
	public void initBot() {
		this.robot=new Robot();		
	}

}
