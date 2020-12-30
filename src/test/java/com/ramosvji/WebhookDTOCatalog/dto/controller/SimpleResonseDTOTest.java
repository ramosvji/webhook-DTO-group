package com.ramosvji.WebhookDTOCatalog.dto.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SimpleResonseDTOTest {
	private static final String TEXT_TO_SPEECH = "this is a Google Assistant response";

	private static SimpleResonseDTO simpleResponse;
	
	@BeforeAll
    public static void init() {
		simpleResponse = new SimpleResonseDTO();
		
		simpleResponse.setTextToSpeech(TEXT_TO_SPEECH);
    }
	
	@Test
	public void testSimpleResponse() {
		assertEquals(TEXT_TO_SPEECH, simpleResponse.getTextToSpeech());
	}
	
	@Test
	public void testToString() {
		assertNotNull(simpleResponse.toString());
	}
}
