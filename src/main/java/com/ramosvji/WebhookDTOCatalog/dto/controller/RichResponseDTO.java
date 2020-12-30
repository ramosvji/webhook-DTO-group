package com.ramosvji.WebhookDTOCatalog.dto.controller;

import java.io.Serializable;
import java.util.List;

public class RichResponseDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private List<ItemDTO> item;

	public List<ItemDTO> getItem() {
		return item;
	}

	public void setItem(List<ItemDTO> item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "RichResponseDTO [item=" + item + "]";
	}
}
