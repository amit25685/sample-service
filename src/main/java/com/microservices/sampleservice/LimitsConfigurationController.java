package com.microservices.sampleservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.sampleservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private ConfigurationL configuration;

	@GetMapping("/message")
	public String getMessage() {
		return "Hello";
	}

	@GetMapping("/limits")
	public LimitConfiguration retriveLimits() {
		return new LimitConfiguration(1000, 1);
	}

	@GetMapping("/limitsConfig")
	public LimitConfiguration retriveLimitsFromConfigurations() {
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}
}
