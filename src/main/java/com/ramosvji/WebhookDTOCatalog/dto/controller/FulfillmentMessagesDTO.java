package com.ramosvji.WebhookDTOCatalog.dto.controller;

import java.io.Serializable;

public class FulfillmentMessagesDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private TextDTO text;

	public TextDTO getText() {
		return text;
	}

	public void setText(TextDTO text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "FulfillmentMessagesDTO [text=" + text + "]";
	}
}
