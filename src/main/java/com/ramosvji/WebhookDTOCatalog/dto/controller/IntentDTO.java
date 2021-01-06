package com.ramosvji.WebhookDTOCatalog.dto.controller;

import java.io.Serializable;

import com.ramosvji.WebhookDTOCatalog.intent.IntentEnum;

public class IntentDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private IntentEnum displayName;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public IntentEnum getDisplayName() {
		return displayName;
	}

	public void setDisplayName(IntentEnum displayName) {
		this.displayName = displayName;
	}

	@Override
	public String toString() {
		return "IntentDTO [name=" + name + ", displayName=" + displayName + "]";
	}
}
