package visitor;
import java.util.ArrayList;

import visitor.element.Employee;
import visitor.visitor.Visitor;

public class Employees {
	
	private ArrayList<Employee> emps = new ArrayList<Employee> ();
	
	public void Attach(Employee e) {
		emps.add(e);
	}
	
	public void Detach(Employee e) {
		emps.remove(e);
	}
	
	public void Accept(Visitor visitor) {
		for (Employee e : emps) {
			e.Accept(visitor);
		}
	}

}
