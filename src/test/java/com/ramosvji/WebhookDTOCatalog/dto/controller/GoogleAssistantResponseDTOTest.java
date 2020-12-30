package com.ramosvji.WebhookDTOCatalog.dto.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GoogleAssistantResponseDTOTest {
	private static final PayloadDTO PAYLOAD = new PayloadDTO();
	
	private static GoogleAssistantResponseDTO googleAssitantResponse;

	@BeforeAll
	public static void init() {
		googleAssitantResponse = new GoogleAssistantResponseDTO();
		
		googleAssitantResponse.setPayload(PAYLOAD);
	}

	@Test
	void testGoogleAssistantResponse() {
		assertEquals(PAYLOAD, googleAssitantResponse.getPayload());
	}
	
	@Test
	public void testToString() {
		assertNotNull(googleAssitantResponse.toString());
	}

}
