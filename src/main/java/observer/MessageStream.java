package observer;

import java.util.*;

public class MessageStream extends Subject {

	private Deque<String> messageHistory = new ArrayDeque<String>();
	
	@Override
	public void setState(String message) {
		// TODO Auto-generated method stub
		messageHistory.add(message);
		this.notifyObservers();
	}

	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return messageHistory.getLast();
	}

}
