package com.ramosvji.WebhookDTOCatalog.dto.controller;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GoogleDTOTest {
	private static final Boolean EXPECTED_USER_RESPONSE = true;
	private static final RichResponseDTO RICH_RESPONSE = new RichResponseDTO();
	
	private static GoogleDTO google;

	@BeforeAll
	public static void init() {
		google = new GoogleDTO();
		
		google.setExpectUserResponse(EXPECTED_USER_RESPONSE);
		google.setRichResponse(RICH_RESPONSE);
	}
	
	@Test
	public void testGoogleDTO() {
		assertAll("googleDTO",
				() -> assertEquals(EXPECTED_USER_RESPONSE, google.getExpectUserResponse()),
	            () -> assertEquals(RICH_RESPONSE, google.getRichResponse())            
	            );
	}
	
	@Test
	public void testToString() {
		assertNotNull(google.toString());
	}

}
