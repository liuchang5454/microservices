package com.springcloud.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.microservices.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitConfigurationController {

	@Autowired
	private Configuration configuration;
	
	@GetMapping("/static-limits")
	public LimitConfiguration getStaticLimits() {
		return new LimitConfiguration(1000, 1);
	}
	
	@GetMapping("/limits")
	public LimitConfiguration getLimits() {
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}

}
