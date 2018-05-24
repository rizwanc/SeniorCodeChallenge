package com.mindex.challenge.compensation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindex.challenge.dao.EmployeeRepository;
import com.mindex.challenge.data.Employee;

@Service
public class CompensationService {

	@Autowired
	CompensationRepository compensationRepository;
	
	@Autowired 
	EmployeeRepository employeeRepository;
	
	public Compensation addCompensation(Compensation compensation) {
		Employee employee = employeeRepository.findByEmployeeId(compensation.getId());
		return compensationRepository.save(new Compensation(employee, compensation.getSalary(), compensation.getEffectiveDate()));
	}
	
	public Compensation getCompensation(String id) {
		return compensationRepository.findOne(id);
	}	
}
