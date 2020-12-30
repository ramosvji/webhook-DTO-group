package com.ramosvji.WebhookDTOCatalog.dto.controller;

import java.io.Serializable;
import java.util.List;

public class TextDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
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
