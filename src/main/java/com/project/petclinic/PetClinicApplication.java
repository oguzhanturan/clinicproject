package com.project.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
//command + shif + o auto import
@SpringBootApplication
@EnableConfigurationProperties(value=SampleProperties.class)
public class PetClinicApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(PetClinicApplication.class, args);
	}

}
