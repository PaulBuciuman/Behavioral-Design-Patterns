package state;

public class FanMed extends State {

private Fan fan;
	
	public FanMed(Fan fan){
		this.fan=fan;
		
	} 
	
	public void handleRequest() {
		System.out.println("Turn fan on to shigh");
		fan.setState(fan.getFanHigh());
	}
	
	public String toString() {
		
		return "Fan is med";
	}
	
}
