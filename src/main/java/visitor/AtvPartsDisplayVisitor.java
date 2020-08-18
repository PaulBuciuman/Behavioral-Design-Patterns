package visitor;

public class AtvPartsDisplayVisitor implements AtvPartVisitor {

	public void visit(Wheel wheel) {
		// TODO Auto-generated method stub
		System.out.println("We have wheel");
	}

	public void visit(Fender fender) {
		// TODO Auto-generated method stub
		System.out.println("We have fender");
	}

	public void visit(Oil oil) {
		// TODO Auto-generated method stub
		System.out.println("We have oil");
	}

	public void visit(PartsOrder partsOrder) {
		// TODO Auto-generated method stub
		System.out.println("We have oil");
	}

}
