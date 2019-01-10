package command;

public class TurnOnCommand implements Command{
	
	private Reciever reciever;
	
	public TurnOnCommand(Reciever reciever) {
		this.reciever = reciever;
	}

	@Override
	public void execute() {
		reciever.on();
		
	}

	@Override
	public void undo() {
		reciever.off();
		
	}

}
