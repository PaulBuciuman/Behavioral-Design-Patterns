package command;

public class Toggle implements Command {

	private Light light;
	
	
	public Toggle(Light light) {
		
		this.light=light;
	}
	public void execute() {
		// TODO Auto-generated method stub
		light.toggle();
	}

}
