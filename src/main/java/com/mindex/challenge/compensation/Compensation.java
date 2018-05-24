package com.mindex.challenge.compensation;


import com.mindex.challenge.data.Employee;

public class Compensation {

	private Employee employee; 
	private String id;
	private double salary;
    private String effectiveDate;
    
    public Compensation() {
    	
    }
      
	public Compensation(Employee employee, double salary, String effectiveDate) {
		this.employee = employee;
		this.salary = salary;
		this.effectiveDate = effectiveDate;
		this.id = employee.getEmployeeId();
	}
	
	public Compensation(String id, double salary, String effectiveDate) {
	    this.id = id;
	    this.salary = salary;
	    this.effectiveDate = effectiveDate;
	}
	
	public String getId() {
		return this.id;
	}

	public void setId(String employeeId) {
		this.id = employeeId;
	}

	public Employee getEmployee() {
		return this.employee;
	}
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public String getEffectiveDate() {
		return this.effectiveDate;
	}
	
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
}
