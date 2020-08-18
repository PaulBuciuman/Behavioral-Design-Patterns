package state;

public class Fan {

	
	State fanOff;
	State fanLow;
	State fanMed;
	State fanHigh;
	
	State state;
	
	public Fan() {
		
		fanOff = new FanOff(this);
		fanLow = new FanLow(this);
		fanMed = new FanMed(this);
		fanHigh = new FanHigh(this);
		
		state = fanOff;
	}

	public void pullChain() {
			
		state.handleRequest();
			
	}
	
	public String toString() {
		
		return state.toString();
	}
	public State getFanLow() {
		// TODO Auto-generated method stub  
		return fanLow;
	}

	public void setState(State state) {
		this.state=state;
	}

	public State getFanMed() {
		// TODO Auto-generated method stub
		return fanMed;
	}

	public State getFanOff() {
		// TODO Auto-generated method stub
		return fanOff;
	}

	public State getFanHigh() {
		// TODO Auto-generated method stub
		return fanHigh;
	}
}
