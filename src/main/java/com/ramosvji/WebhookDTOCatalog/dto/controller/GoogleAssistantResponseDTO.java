package com.ramosvji.WebhookDTOCatalog.dto.controller;

import java.io.Serializable;

public class GoogleAssistantResponseDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private PayloadDTO payload;

	public PayloadDTO getPayload() {
		return payload;
	}

	public void setPayload(PayloadDTO payload) {
		this.payload = payload;
	}

	@Override
	public String toString() {
		return "GoogleAssistantResponseDTO [payload=" + payload + "]";
	}
}
