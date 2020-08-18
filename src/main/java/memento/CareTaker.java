package memento;

import java.util.Stack;

public class CareTaker {

	private Stack <EmployeeMemento> employeeHistory =new Stack<EmployeeMemento>();
	
	public void save(Emplyee emp) {
		employeeHistory.push(emp.save());
		
	}
	
	public void revert(Emplyee emp) {
		emp.revert(employeeHistory.pop());
		
	}
}
