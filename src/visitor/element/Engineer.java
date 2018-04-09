package visitor.element;

import visitor.visitor.Visitor;

public class Engineer extends Employee{

	public Engineer(String name, double income, int vacations) {
		super(name, income, vacations);
		this.type = "Engineer";
	}

	@Override
	public void Accept(Visitor visitor) {
		visitor.Visit(this);
	}

}
