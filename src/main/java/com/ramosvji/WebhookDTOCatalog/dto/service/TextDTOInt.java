package com.ramosvji.WebhookDTOCatalog.dto.service;

import java.util.List;

public class TextDTOInt {
	private List<String> text;

	public List<String> getText() {
		return text;
	}

	public void setText(List<String> text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "TextDTO [text=" + text + "]";
	}
}
