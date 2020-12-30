package com.ramosvji.WebhookDTOCatalog.dto.controller;

import java.io.Serializable;
import java.util.List;

public class CardDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String title;
	private String subtitle;
	private String imageUri;
	private List<ButtonDTO> buttons;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getSubtitle() {
		return subtitle;
	}
	
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	
	public String getImageUri() {
		return imageUri;
	}
	
	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}
	
	public List<ButtonDTO> getButtons() {
		return buttons;
	}
	
	public void setButtons(List<ButtonDTO> buttons) {
		this.buttons = buttons;
	}
	
	@Override
	public String toString() {
		return "CardDTO [title=" + title + ", subtitle=" + subtitle + ", imageUri=" + imageUri + ", buttons=" + buttons
				+ "]";
	}
}
