package com.esprit.etudiants;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EtudiantRestApi {

	
	
private String title="chtioui mohamed";

@RequestMapping("/hello")
	public String SayHello() {
		System.out.println(title);
		
		return title;
	} 
}

	

