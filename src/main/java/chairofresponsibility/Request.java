package chairofresponsibility;

public class Request {

	private RequestType requestType;
	private double amount;
	
	public Request(RequestType type,double amount) {
		
		this.requestType=type;
		this.amount=amount;
	}
	
	public RequestType getRequestType() {
		
		return this.requestType;
	}
	
	public double getAmount() {
		
		return this.amount;
	}
	
}
