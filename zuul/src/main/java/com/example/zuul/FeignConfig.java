package com.example.zuul;

import org.springframework.context.annotation.Configuration;

import feign.auth.BasicAuthRequestInterceptor;

@Configuration
public class FeignConfig {
	
	public BasicAuthRequestInterceptor mBasicAuthRequestInterceptor() {
		return new BasicAuthRequestInterceptor("user", "user");
	}
}
