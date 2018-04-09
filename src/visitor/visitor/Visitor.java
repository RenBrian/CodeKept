package visitor.visitor;

import visitor.element.Employee;

public abstract class Visitor {
	
	protected String visitor_type;
	
	
	
	public Visitor() {
		super();
		this.visitor_type = "Visitor";
	}

	public String getVisitor_type() {
		return visitor_type;
	}

	public void setVisitor_type(String visitor_type) {
		this.visitor_type = visitor_type;
	}




	abstract public void Visit(Employee e);

}
