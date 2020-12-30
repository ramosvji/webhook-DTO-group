package com.ramosvji.WebhookDTOCatalog.dto.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FulfillmentMessagesWithCardDTOTest {
	private static FulfillmentMessagesWithCardDTO fulfillment;
	
	private static CardDTO CARD = new CardDTO();

	@BeforeAll
	public static void init() {
		fulfillment = new FulfillmentMessagesWithCardDTO();
		
		fulfillment.setCard(CARD);
	}

	@Test
	void test() {
		assertEquals(CARD, fulfillment.getCard());
	}
	
	@Test
	public void testToString() {
		assertNotNull(fulfillment.toString());
	}

}
