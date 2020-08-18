package command;

import java.util.List;

public class AllLightsCommand implements Command {

	
	private List<Light> lights;
	
	public AllLightsCommand(List<Light> lights) {
		
		this.lights=lights;
	}
	public void execute() {
		// TODO Auto-generated method stub
			for(Light l:lights){
				if(!l.isOn())
				l.toggle();
			}
		
	}

}
