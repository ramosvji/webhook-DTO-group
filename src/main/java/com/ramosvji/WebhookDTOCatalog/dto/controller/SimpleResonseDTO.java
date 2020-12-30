package com.ramosvji.WebhookDTOCatalog.dto.controller;

import java.io.Serializable;

public class SimpleResonseDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String textToSpeech;

	public String getTextToSpeech() {
		return textToSpeech;
	}

	public void setTextToSpeech(String textToSpeech) {
		this.textToSpeech = textToSpeech;
	}

	@Override
	public String toString() {
		return "SimpleResonseDTO [textToSpeech=" + textToSpeech + "]";
	}
}
