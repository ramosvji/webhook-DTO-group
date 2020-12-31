package com.ramosvji.WebhookDTOCatalog.dto.controller.v1;

import java.io.Serializable;

import com.ramosvji.WebhookDTOCatalog.dto.controller.FulfillmentMessagesDTO;

public class WebhookResponseDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	FulfillmentMessagesDTO fulfillmentMessages;

	public FulfillmentMessagesDTO getFulfillmentMessages() {
		return fulfillmentMessages;
	}

	public void setFulfillmentMessages(FulfillmentMessagesDTO fulfillmentMessages) {
		this.fulfillmentMessages = fulfillmentMessages;
	}

	@Override
	public String toString() {
		return "WebhookRequestDTOResponse [fulfillmentMessages=" + fulfillmentMessages + "]";
	}
}
