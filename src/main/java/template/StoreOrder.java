package template;

public class StoreOrder extends OrderTemplate {

	@Override
	public void doCheckout() {
		// TODO Auto-generated method stub
		System.out.println("Doing Checkout for store");
	}

	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
		System.out.println("physical payment at the store");
	}

	@Override
	public void doReceipt() {
		// TODO Auto-generated method stub
		System.out.println("write receipt");
	}

	@Override
	public void doDelivery() {
		// TODO Auto-generated method stub
		System.out.println("no delivery");

	}

}
