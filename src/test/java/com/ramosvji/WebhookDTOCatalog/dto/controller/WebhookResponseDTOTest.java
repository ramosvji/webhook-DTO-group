package com.ramosvji.WebhookDTOCatalog.dto.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WebhookResponseDTOTest {
	private static WebhookResponseDTO webhookResponse;
	
	private static final FulfillmentMessagesDTO FULFILLMENT_MESSAGES = new FulfillmentMessagesDTO();
	
	@BeforeAll
    public static void init() {
		webhookResponse = new WebhookResponseDTO();
		
		webhookResponse.setFulfillmentMessages(FULFILLMENT_MESSAGES);
	}
	
	@Test
	public void testWebhookResponse() {
		assertEquals(FULFILLMENT_MESSAGES, webhookResponse.getFulfillmentMessages());
	}
	
	@Test
	public void testToString() {
		assertNotNull(webhookResponse.toString());
	}
}
