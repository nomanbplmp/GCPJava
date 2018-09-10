package com.nk.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloAppEngineController {

	@RequestMapping("/")
	public String Hello() {
		return "Hello AppEngine";
	}
}


