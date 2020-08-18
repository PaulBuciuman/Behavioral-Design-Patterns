package visitor;

import java.util.List;

public class AtvPartsShippingVisitor implements AtvPartVisitor {
	double shippingAmount = 0;
	public void visit(Wheel wheel) {
		// TODO Auto-generated method stub
		shippingAmount+=15;
	}

	public void visit(Fender fender) {
		// TODO Auto-generated method stub
		shippingAmount+=9;
	}

	public void visit(Oil oil) {
		// TODO Auto-generated method stub
		shippingAmount+=3;
	}

	public void visit(PartsOrder partsOrder) {
		// TODO Auto-generated method stub
		List<AtvPart> parts = partsOrder.getParts();
		if(parts.size()>3) shippingAmount-=5;
	
	
	System.out.println("shipping ammount is "+shippingAmount);

	}
}
