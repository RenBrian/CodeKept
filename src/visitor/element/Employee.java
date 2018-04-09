package visitor.element;

import java.util.Date;

import visitor.visitor.Visitor;

/**
 * �����࣬�Ƕ���ĳ��󣬺��г�Ա����������ʵ��������Ҫ�̳еĲ���ʹ��protected/public
 * �ӿڣ��Ƕ���Ϊ�ĳ���ֻ��static final�ı���
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
