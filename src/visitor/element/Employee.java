package visitor.element;

import java.util.Date;

import visitor.visitor.Visitor;

/**
 * 抽象类，是对类的抽象，含有成员变量，不可实例化，需要继承的部分使用protected/public
 * 接口，是对行为的抽象，只有static final的变量
 * @author st0001
 *
 */
public abstract class Employee {
	
	protected String name;
	protected double income;
	protected int vacations;
	protected String type;
	
	public Employee(String name, double income, int vacations) {
		super();
		this.name = name;
		this.income = income;
		this.vacations = vacations;
		this.type = "Employee";
		System.out.println(">>>>>>>>>>>Employee<<<<<<<<<<" + (new Date().toString()));
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public int getVacations() {
		return vacations;
	}
	public void setVacations(int vacations) {
		this.vacations = vacations;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	abstract public void Accept(Visitor visitor);

}
