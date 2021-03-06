package observer;

import java.util.*;

public abstract class Subject {

	
	private List<Observer> observers = new ArrayList<Observer>();
	
	public abstract void setState(String state) ;
	public abstract String getState();
	
	public void attach(Observer observer) {
		
		observers.add(observer);
	}
	
	public void detach(Observer observer) {
		observers.remove(observer);
		
	}
	
	public void notifyObservers() {
		for (Observer obs:observers)
			obs.update();
	}
}
