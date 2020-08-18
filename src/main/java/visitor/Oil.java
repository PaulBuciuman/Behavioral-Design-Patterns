package visitor;

public class Oil implements AtvPart {

	public void accept(AtvPartVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

	

}
