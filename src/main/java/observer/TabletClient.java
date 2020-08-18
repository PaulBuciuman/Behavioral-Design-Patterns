package observer;

public class TabletClient extends Observer {

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Tablet Stream: "+subject.getState());
	}
	
	public TabletClient(Subject subject) {
		this.subject=subject;
		subject.attach(this);
		
	}
	public void addMessage(String message) {
		subject.setState(message + " - sent from tablet");
		
	}

}
