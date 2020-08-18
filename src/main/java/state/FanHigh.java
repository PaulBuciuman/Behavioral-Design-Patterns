package state;

public class FanHigh extends State {

private Fan fan;
	
	public FanHigh(Fan fan){
		this.fan=fan;
		
	} 
	
	public void handleRequest() {
		System.out.println("Turn fan off");
		fan.setState(fan.getFanOff());
	}
	
	public String toString() {
		
		return "Fan is high";
	}
	
	
}
