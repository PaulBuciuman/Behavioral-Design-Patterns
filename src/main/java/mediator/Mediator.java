package mediator;
import java.util.*;

import command.*;

public class Mediator {
	
	private List<Light> lights = new ArrayList<Light>();

	public void registerLight(Light light) {
		lights.add(light);
		
	}
	
	public void turnOnAllLights() {
		for (Light light: lights) {
			
			if(!light.isOn()) {
				
				light.toggle();
			}
		}
		
	}
}
