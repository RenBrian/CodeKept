package visitor.visitor;

import visitor.element.Employee;

public class IncomeVisitor extends Visitor{
	
	public IncomeVisitor() {
		super();
		this.visitor_type = "IncomeVisitor";
	}

	@Override
	public void Visit(Employee e) {
		System.out.println(e.getName() + " -> " + e.getIncome());
		System.out.println("/*" + this.getVisitor_type() + " -> " + e.getType() +" */");
	}

}
