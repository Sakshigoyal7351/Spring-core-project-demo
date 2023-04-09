package com.removing_xml_file;





public class Salary {

	
	private int salary;
	
	private int bonus;
	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Salary(int salary, int bonus) {
		super();
		this.salary = salary;
		this.bonus = bonus;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return "Salary [salary=" + salary + ", bonus=" + bonus + "]";
	}
	
	
}
