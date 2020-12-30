package com.ramosvji.WebhookDTOCatalog.dto.controller;

import java.io.Serializable;

public class ItemDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private SimpleResonseDTO simpleResponse;

	public SimpleResonseDTO getSimpleResponse() {
		return simpleResponse;
	}

	public void setSimpleResponse(SimpleResonseDTO simpleResponse) {
		this.simpleResponse = simpleResponse;
	}

	@Override
	public String toString() {
		return "ItemDTO [simpleResponse=" + simpleResponse + "]";
	}
}
