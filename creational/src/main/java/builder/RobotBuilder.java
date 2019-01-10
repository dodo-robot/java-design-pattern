package builder;

public interface RobotBuilder {
	
	void initBot();
	
	void assembleArms();
	void assembleHeads();
	void assembleDoors();
	void assembleWheels();
	void assembleSensors();
	void assembleFireAlarm();
	void assembleLegs();
	
	Robot build();
	
	
	

}
