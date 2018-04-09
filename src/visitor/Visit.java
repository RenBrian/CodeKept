package visitor;

import visitor.element.Engineer;
import visitor.element.Teacher;
import visitor.visitor.IncomeVisitor;
import visitor.visitor.VacationVisitor;

public class Visit {
	
	public static void main(String[] args) {
		Teacher t1 = new Teacher("Ben", 5000.00, 18);
		Engineer e1 = new Engineer("Mick", 10000.00, 10);
		
		Employees emps = new Employees();
		emps.Attach(t1);
		emps.Attach(e1);
		
		IncomeVisitor ivisitor = new IncomeVisitor();
		VacationVisitor vvisitor = new VacationVisitor();
		
		emps.Accept(ivisitor);
		emps.Accept(vvisitor);
		
		t1.Accept(vvisitor);
		e1.Accept(ivisitor);
	}

}
