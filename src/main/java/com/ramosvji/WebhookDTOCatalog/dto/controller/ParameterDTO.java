package com.ramosvji.WebhookDTOCatalog.dto.controller;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ParameterDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("param-name")
	private String paramName;
	
	public String getParamName() {
		return paramName;
	}

	public void setParamName(String paramName) {
		this.paramName = paramName;
	}

	@Override
	public String toString() {
		return "ParameterDTO [paramName=" + paramName + "]";
	}
}
