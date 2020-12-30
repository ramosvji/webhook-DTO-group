package com.ramosvji.WebhookDTOCatalog.dto.controller;

import java.io.Serializable;

public class IntentDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String displayName;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDisplayName() {
		return displayName;
	}
	
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	@Override
	public String toString() {
		return "IntentDTO [name=" + name + ", displayName=" + displayName + "]";
	}
}
