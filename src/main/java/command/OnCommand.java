package command;

public class OnCommand implements Command {

	private Light light;
	public void execute() {
		// TODO Auto-generated method stub
		light.on();
	}
	
	public OnCommand(Light light) {
		
		this.light=light;
	}
	
	

}
