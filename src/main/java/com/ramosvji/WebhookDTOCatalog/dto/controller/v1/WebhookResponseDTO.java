package com.ramosvji.WebhookDTOCatalog.dto.controller.v1;

import java.io.Serializable;
import java.util.List;

import com.ramosvji.WebhookDTOCatalog.dto.controller.FulfillmentMessagesDTO;

public class WebhookResponseDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private List<FulfillmentMessagesDTO> fulfillmentMessages;

	public List<FulfillmentMessagesDTO> getFulfillmentMessages() {
		return fulfillmentMessages;
	}

	public void setFulfillmentMessages(List<FulfillmentMessagesDTO> fulfillmentMessages) {
		this.fulfillmentMessages = fulfillmentMessages;
	}

	@Override
	public String toString() {
		return "WebhookRequestDTOResponse [fulfillmentMessages=" + fulfillmentMessages + "]";
	}
}
