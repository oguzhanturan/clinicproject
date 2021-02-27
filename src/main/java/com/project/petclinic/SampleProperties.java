package com.project.petclinic;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="sample")
public class SampleProperties {
	
	private boolean typeSafeParameter = false;

	public boolean isTypeSafeParameter() {
		return typeSafeParameter;
	}

	public void setTypeSafeParameter(boolean typeSafeParameter) {
		this.typeSafeParameter = typeSafeParameter;
	}
	
}
