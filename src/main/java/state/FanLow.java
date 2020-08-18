package state;

public class FanLow extends State {

private Fan fan;
	
	public FanLow(Fan fan){
		this.fan=fan;
		
	} 
	
	public void handleRequest() {
		System.out.println("Turn fan on to medium");
		fan.setState(fan.getFanMed());
	}
	
	public String toString() {
		
		return "Fan is low";
	}
	
}
