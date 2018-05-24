package com.mindex.challenge.report;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindex.challenge.dao.EmployeeRepository;
import com.mindex.challenge.data.Employee;

@Service
public class ReportingStructureService {

	@Autowired
    private EmployeeRepository employeeRepository;
	
	public Employee getEmployee(String id) {
		Employee employee = employeeRepository.findByEmployeeId(id);
		return employee;
	}
	
}
