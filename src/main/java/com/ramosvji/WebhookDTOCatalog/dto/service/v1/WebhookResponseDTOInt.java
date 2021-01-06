package com.ramosvji.WebhookDTOCatalog.dto.service.v1;

import java.util.List;

import com.ramosvji.WebhookDTOCatalog.dto.service.FulfillmentMessagesDTOInt;

public class WebhookResponseDTOInt {
	private List<FulfillmentMessagesDTOInt> fulfillmentMessages;

	public List<FulfillmentMessagesDTOInt> getFulfillmentMessages() {
		return fulfillmentMessages;
	}

	public void setFulfillmentMessages(List<FulfillmentMessagesDTOInt> fulfillmentMessages) {
		this.fulfillmentMessages = fulfillmentMessages;
	}

	@Override
	public String toString() {
		return "WebhookResponseDTOInt [fulfillmentMessages=" + fulfillmentMessages + "]";
	}
}
