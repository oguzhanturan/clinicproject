package com.project.petclinic;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SampleConfiguration {
	@Autowired
	private SampleProperties sampleProperties;
	
	@PostConstruct
	public void init() {
		System.out.println("Sample parameter : "+sampleProperties.isTypeSafeParameter());
	}
}
