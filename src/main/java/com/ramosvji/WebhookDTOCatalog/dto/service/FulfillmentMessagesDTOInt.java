package com.ramosvji.WebhookDTOCatalog.dto.service;

public class FulfillmentMessagesDTOInt {
	private TextDTOInt text;

	public TextDTOInt getText() {
		return text;
	}

	public void setText(TextDTOInt text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "FulfillmentMessagesDTO [text=" + text + "]";
	}
}