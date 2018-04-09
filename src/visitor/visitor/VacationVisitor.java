package visitor.visitor;

import visitor.element.Employee;

public class VacationVisitor extends Visitor{
	
	public VacationVisitor() {
		this.visitor_type = "VacationVisitor";
	}

	@Override
	public void Visit(Employee e) {
		System.out.println(e.getName() + " -> " + e.getVacations());
		System.out.println("/* " + this.getVisitor_type() + " -> " + e.getType() + " */");
	}

}
