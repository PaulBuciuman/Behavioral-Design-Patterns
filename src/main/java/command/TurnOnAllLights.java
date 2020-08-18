package command;
import mediator.*;

public class TurnOnAllLights implements Command {

	Mediator med;
	
	
	public TurnOnAllLights(Mediator med) {
		
		this.med=med;
	}
	public void execute() {
		// TODO Auto-generated method stub
		med.turnOnAllLights();
	}

}
