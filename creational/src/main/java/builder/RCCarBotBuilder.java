package builder;

public class RCCarBotBuilder implements RobotBuilder{

	private Robot robot;  
	
	public RCCarBotBuilder() {}
	
	@Override
	public void initBot() {
		this.robot=new Robot();		
	}

	@Override
	public void assembleArms() {
		this.robot.setArms("no arms required for rccarbot"); 
	}

	@Override
	public void assembleHeads() {
		this.robot.setHead("no head required for rccarbot");
	}

	@Override
	public void assembleDoors() {
		this.robot.setDoors("settings door");
	}

	@Override
	public void assembleWheels() {
		this.robot.setWheels("settings whhels");
	}

	@Override
	public void assembleSensors() {
		this.robot.setSensors("settings sensors");
	}

	@Override
	public void assembleFireAlarm() {
		this.robot.setFireAlarm("settings fire alarm");
	}

	@Override
	public void assembleLegs() {
		this.robot.setLegs("no legs required for rccarbot");
	}
	@Override
	public Robot build() {
		return robot;
	}

}
