package com.ramosvji.WebhookDTOCatalog.dto.controller;

import java.io.Serializable;

public class OutputContextsDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Integer lifespanCount;
	private ParameterDTO parameters;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getLifespanCount() {
		return lifespanCount;
	}
	
	public void setLifespanCount(Integer lifespanCount) {
		this.lifespanCount = lifespanCount;
	}
	
	public ParameterDTO getParameters() {
		return parameters;
	}
	
	public void setParameters(ParameterDTO parameters) {
		this.parameters = parameters;
	}
	
	@Override
	public String toString() {
		return "OutputContextsDTO [name=" + name + ", lifespanCount=" + lifespanCount + ", parameters=" + parameters
				+ "]";
	}	
}
