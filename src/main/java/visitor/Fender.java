package visitor;

public class Fender implements AtvPart {

	
	public void accept(AtvPartVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

}
