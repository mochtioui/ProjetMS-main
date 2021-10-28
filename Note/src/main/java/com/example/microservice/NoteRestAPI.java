package com.example.microservice;
import org.springframework.web.bind.annotation.RequestMapping;

public class NoteRestAPI {

		private String title="Hello, I'm the note Microservice";
		
		@RequestMapping("/hello")
		public String sayHello() {
			System.out.println(title);
			return title;
		}

}
