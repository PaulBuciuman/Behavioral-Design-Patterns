package strategy;

public class AmexStrategy extends Strategy {

	@Override
	public boolean isValid(CreditCard creditCard) {
		// TODO Auto-generated method stub
		boolean isValid= true;
		isValid = creditCard.getNumber().startsWith("12");
		
		if(isValid) {
			
			isValid = creditCard.getNumber().length()==15;
		}
		
		if(isValid) {
			isValid = algorithm();			
		}
		
		return isValid;
		
	}

	
	
}
