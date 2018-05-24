package com.mindex.challenge.report;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindex.challenge.data.Employee;

@RestController
public class ReportingStructureController {

	@Autowired
	ReportingStructureService reportService;
	
	@RequestMapping("/report/{id}")
	public ReportingStructure getDirectReports(@PathVariable String id) {
		Employee employee = reportService.getEmployee(id);
        return new ReportingStructure(employee);
	}
}
