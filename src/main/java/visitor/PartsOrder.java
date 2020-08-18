package visitor;

import java.util.*;

public class PartsOrder implements AtvPart {

	private List<AtvPart> parts = new ArrayList<AtvPart>();
	public PartsOrder() {
		
		
	}
	
	public void addPart(AtvPart atvPart) {
		parts.add(atvPart);
		
	}
	
	public List<AtvPart> getParts(){
		return Collections.unmodifiableList(parts);
		
	}
	
//	public double calculateShipping() {
//		double shippingCost=0;
//		for(AtvPart atv:parts) {
//			shippingCost+=atv.calculateShipping();
//			
//		}		
//		return shippingCost;
//	}
	
	
	public void accept(AtvPartVisitor visitor) {
		for(AtvPart atvPart:parts) {
			atvPart.accept(visitor);
			
		}
		visitor.visit(this);
	}
}
