package com.ramosvji.WebhookDTOCatalog.dto.controller;

import java.io.Serializable;

public class FulfillmentMessagesWithCardDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private CardDTO card;

	public CardDTO getCard() {
		return card;
	}

	public void setCard(CardDTO card) {
		this.card = card;
	}

	@Override
	public String toString() {
		return "FulfillmentMessagesWithCardDTO [card=" + card + "]";
	}
}
