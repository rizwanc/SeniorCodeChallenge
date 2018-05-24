package com.mindex.challenge.report;

import com.mindex.challenge.data.Employee;

public class ReportingStructure {

	Employee employee;
	int numberOfReports;
	
	public ReportingStructure() {
	}
	
	public ReportingStructure(Employee employee) {
		super();
		this.employee = employee;
	}
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public int getNumberOfReports() {
		return numberOfReports = this.employee.getDirectReports().size();
	}

	public void setNumberOfReports(int numberOfReports) {
		this.numberOfReports = numberOfReports;
	}
}
