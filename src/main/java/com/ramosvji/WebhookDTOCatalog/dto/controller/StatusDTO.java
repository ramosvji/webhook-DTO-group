package com.ramosvji.WebhookDTOCatalog.dto.controller;

import java.io.Serializable;

public class StatusDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer code;
	private String errorType;
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getErrorType() {
		return errorType;
	}
	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}
	
	@Override
	public String toString() {
		return "StatusDto [code=" + code + ", errorType=" + errorType + "]";
	}
	
}
