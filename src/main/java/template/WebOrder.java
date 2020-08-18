package template;

public class WebOrder extends OrderTemplate{

	@Override
	public void doCheckout() {
		// TODO Auto-generated method stub
		System.out.println("Doing Checkout");
	}

	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
		System.out.println("Doing payment online");
	}

	@Override
	public void doReceipt() {
		// TODO Auto-generated method stub
		System.out.println("email receipt");
	}

	@Override
	public void doDelivery() {
		// TODO Auto-generated method stub
		System.out.println("ship the item");
	}

	
	
}
