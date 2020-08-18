package state;

public class FanOff extends State {

	
	private Fan fan;
	
	public FanOff(Fan fan){
		this.fan=fan;
		
	} 
	
	public void handleRequest() {
		System.out.println("Turn fan on to low");
		fan.setState(fan.getFanLow());
	}
	
	public String toString() {
		
		return "Fan is off";
	}
}
