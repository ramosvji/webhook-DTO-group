package com.ramosvji.WebhookDTOCatalog.dto.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PayloadDTOTest {
	private static final GoogleDTO GOOGLE = new GoogleDTO();

	private static PayloadDTO payload;
	
	@BeforeAll
	public static void init() {
		payload = new PayloadDTO();
		
		payload.setGoogle(GOOGLE);
	}
	
	@Test
	public void testPayload() {
		assertEquals(GOOGLE, payload.getGoogle());
	}
	
	@Test
	public void testToString() {
		assertNotNull(payload.toString());
	}

}
