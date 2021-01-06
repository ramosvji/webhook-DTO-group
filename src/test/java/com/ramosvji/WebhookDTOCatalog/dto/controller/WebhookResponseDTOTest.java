package com.ramosvji.WebhookDTOCatalog.dto.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ramosvji.WebhookDTOCatalog.dto.controller.v1.WebhookResponseDTO;

@SpringBootTest
class WebhookResponseDTOTest {
	private static WebhookResponseDTO webhookResponse;
	
	private static final FulfillmentMessagesDTO FULFILLMENT_MESSAGES = new FulfillmentMessagesDTO();
	private static List<FulfillmentMessagesDTO> dtos;
	
	@BeforeAll
    public static void init() {
		webhookResponse = new WebhookResponseDTO();
		dtos = new ArrayList<FulfillmentMessagesDTO>();
		dtos.add(FULFILLMENT_MESSAGES);
		
		webhookResponse.setFulfillmentMessages(dtos);
	}
	
	@Test
	public void testWebhookResponse() {
		assertEquals(dtos, webhookResponse.getFulfillmentMessages());
	}
	
	@Test
	public void testToString() {
		assertNotNull(webhookResponse.toString());
	}
}
