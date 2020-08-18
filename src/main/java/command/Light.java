package command;

//receiver
public class Light {

	
	private boolean isOn = false;
	private String name="";
	
	public Light() {}
	
	public Light(String name)
	{
		this.name=name;
	}
	
	public boolean isOn() {
		
		return this.isOn;
	}
	public void toggle() {
		
		if(isOn) {
			off();
			isOn=false;
		}
		else {
			on();
			isOn=true;
		}
	}
	
	public void on() {
		
		System.out.println(this.name + " on");
	}
	public void off() {
		System.out.println(this.name + " off");
		
	}
}
