package com.ramosvji.WebhookDTOCatalog.dto.controller;

import java.io.Serializable;

public class GoogleDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Boolean expectUserResponse;
	private RichResponseDTO richResponse;
	
	public Boolean getExpectUserResponse() {
		return expectUserResponse;
	}
	
	public void setExpectUserResponse(Boolean expectUserResponse) {
		this.expectUserResponse = expectUserResponse;
	}
	
	public RichResponseDTO getRichResponse() {
		return richResponse;
	}
	
	public void setRichResponse(RichResponseDTO richResponse) {
		this.richResponse = richResponse;
	}
	
	@Override
	public String toString() {
		return "GoogleDTO [expectUserResponse=" + expectUserResponse + ", richResponse=" + richResponse + "]";
	}
}
