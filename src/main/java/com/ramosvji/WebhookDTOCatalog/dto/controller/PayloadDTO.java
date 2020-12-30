package com.ramosvji.WebhookDTOCatalog.dto.controller;

import java.io.Serializable;

public class PayloadDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private GoogleDTO google;
	
	public GoogleDTO getGoogle() {
		return google;
	}
	
	public void setGoogle(GoogleDTO google) {
		this.google = google;
	}

	@Override
	public String toString() {
		return "PayloadDTO [google=" + google + "]";
	}
}
