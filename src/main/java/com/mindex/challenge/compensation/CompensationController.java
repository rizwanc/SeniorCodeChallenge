package com.mindex.challenge.compensation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompensationController {

	@Autowired
	CompensationService compensationService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/compensation")
    public Compensation addCompensation(@RequestBody Compensation compensation) {
	   return compensationService.addCompensation(compensation);
    }

    @GetMapping("/compensation/{id}")
    public Compensation getCompensation(@PathVariable String id) {
      return compensationService.getCompensation(id);
    }
}
