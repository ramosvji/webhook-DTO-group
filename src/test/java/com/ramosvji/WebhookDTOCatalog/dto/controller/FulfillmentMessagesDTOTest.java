package com.ramosvji.WebhookDTOCatalog.dto.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FulfillmentMessagesDTOTest {
	private static final TextDTO TEXT = new TextDTO();
	
	private static FulfillmentMessagesDTO fulfillmentMessages;
	
	@BeforeAll
	public static void init() {
		fulfillmentMessages = new FulfillmentMessagesDTO();
		
		fulfillmentMessages.setText(TEXT);
	}
	
	@Test
	public void testFulfillmentMessages() {
		assertEquals(TEXT, fulfillmentMessages.getText());
	}
	
	@Test
	public void testToString() {
		assertNotNull(fulfillmentMessages.toString());
	}
}
