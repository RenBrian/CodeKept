package visitor.element;

import visitor.visitor.Visitor;

public class Teacher extends Employee{
	//¹¹Ôìº¯Êý¼Ì³Ð
	public Teacher(String name, double income, int vacations) {
		super(name, income, vacations);
		this.type = "teacher";
	}
	
	@Override
	public void Accept(Visitor visitor) {
		visitor.Visit(this);
	}

}
