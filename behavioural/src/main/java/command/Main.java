package command;

import java.util.ArrayList;
import java.util.List;

public class Main {

	private List<Command> commandList; 

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	private void run() {
		Reciever reciever = new Light("Flesh Light");
		Command command = new TurnOnCommand(reciever);
		commandList = new ArrayList<Command>();
		commandList.add(command);

		Invoker invoker = new Invoker(command);
		invoker.executeCommand();

		Reciever reciever2 = new Motor("Motor");
		Command command2 = new TurnOnCommand(reciever2);
		commandList.add(command2);

		invoker.setCommand(command2);
		invoker.executeCommand();

		commandList.forEach(commandBackup -> {
			invoker.setCommand(commandBackup);
			invoker.undoCommand();
		});


	}

}
