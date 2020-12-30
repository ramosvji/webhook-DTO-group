package com.ramosvji.WebhookDTOCatalog.dto.controller;

import java.io.Serializable;

public class ButtonDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String text;
	private String postback;
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getPostback() {
		return postback;
	}

	public void setPostback(String postback) {
		this.postback = postback;
	}

	@Override
	public String toString() {
		return "ButtonDto [text=" + text + ", postback=" + postback + "]";
	}
	
	
}
