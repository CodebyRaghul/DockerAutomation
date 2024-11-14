package com.dockerautomations;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/DockerAutomations")
public class DockerAutomationsController {
	
	@GetMapping(value="/get")
	public String get() {
		return "getmapping docker automation";
		
	}

}
