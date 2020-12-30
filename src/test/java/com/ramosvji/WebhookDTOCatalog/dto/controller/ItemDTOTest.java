package com.ramosvji.WebhookDTOCatalog.dto.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ItemDTOTest {
	private static ItemDTO item;
	private static SimpleResonseDTO simpleResponse;

	@BeforeAll
	public static void init() {
		item = new ItemDTO();
		
		simpleResponse = new SimpleResonseDTO();
		simpleResponse.setTextToSpeech("this is a Google Assistant response");
	
		item.setSimpleResponse(simpleResponse);
	}
	
	@Test
	public void testItem() {
		assertNotNull(item.getSimpleResponse());
		assertEquals(simpleResponse, item.getSimpleResponse());
	}
	
	@Test
	public void testToString() {
		assertNotNull(item.toString());
	}

}
