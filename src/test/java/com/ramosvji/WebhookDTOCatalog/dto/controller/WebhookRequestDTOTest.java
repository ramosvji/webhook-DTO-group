package com.ramosvji.WebhookDTOCatalog.dto.controller;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ramosvji.WebhookDTOCatalog.dto.controller.v1.WebhookRequestDTO;

@SpringBootTest
class WebhookRequestDTOTest {
	private static final String RESPONSE_ID = "response id";
	private static final String SESSION = "session";
	private static final QueryResultDTO QUERY_RESULT = new QueryResultDTO();
	private static final OriginalDetectIntentRequestDTO ORIGINAL_DETECTING_INTENT_REQUEST = new OriginalDetectIntentRequestDTO();
	
	private static WebhookRequestDTO webhookRequest;
	
	@BeforeAll
    public static void init() {
		webhookRequest = new WebhookRequestDTO();
		
		webhookRequest.setResponseId(RESPONSE_ID);
		webhookRequest.setSession(SESSION);
		webhookRequest.setQueryResult(QUERY_RESULT);
		webhookRequest.setOriginalDetectIntentRequest(ORIGINAL_DETECTING_INTENT_REQUEST);
	}
	
	@Test
	public void testWebhoohk() {
		assertAll("webhook",
				() -> assertEquals(RESPONSE_ID, webhookRequest.getResponseId()),
	            () -> assertEquals(SESSION, webhookRequest.getSession()),
	            () -> assertEquals(QUERY_RESULT, webhookRequest.getQueryResult()),
	            () -> assertEquals(ORIGINAL_DETECTING_INTENT_REQUEST, webhookRequest.getOriginalDetectIntentRequest())
	            );
	}
	
	@Test
	public void testToString() {
		assertNotNull(webhookRequest.toString());
	}
	
}
