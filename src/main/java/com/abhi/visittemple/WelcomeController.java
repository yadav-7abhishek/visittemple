package com.abhi.visittemple;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("")
	public ResponseEntity<String> sayHello(){
		return ResponseEntity.ok("Hello Mr Abhi From Ayodhaya" );
	}
}
