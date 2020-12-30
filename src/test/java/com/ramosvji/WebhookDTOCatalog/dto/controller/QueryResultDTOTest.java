package com.ramosvji.WebhookDTOCatalog.dto.controller;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class QueryResultDTOTest {
	private static final String QUERY_TEXT = "text";
	private static final ParameterDTO PARAMETER = new ParameterDTO();
	private static final Boolean ALL_REQUIRED_PARAMS_PRESENT = true;
	private static final String FULLFILLMENTTEXT = "fulfillmenttext";
	private static final FulfillmentMessagesDTO MESSAGES = new FulfillmentMessagesDTO();
	private static final OutputContextsDTO OUTPUT_CONTEXTS = new OutputContextsDTO();
	private static final IntentDTO INTENT = new IntentDTO();
	private static final Integer INTENT_DETECTION_COFIDENCE = 5;
	private static final DiagnosticInfoDTO DIAGNOSTIC_INFO = new DiagnosticInfoDTO();
	private static final String LANGUAGE_CODE = "EN";
	
	private static QueryResultDTO queryResult;
	
	@BeforeAll
    public static void init() {
		queryResult = new QueryResultDTO();
		
		queryResult.setQueryText(QUERY_TEXT);
		queryResult.setParameters(PARAMETER);
		queryResult.setAllRequiredParamsPresent(ALL_REQUIRED_PARAMS_PRESENT);
		queryResult.setFulfillmentText(FULLFILLMENTTEXT);
		queryResult.setFulfillmentMessages(Arrays.asList(MESSAGES, MESSAGES));
		queryResult.setOutputContexts(Arrays.asList(OUTPUT_CONTEXTS, OUTPUT_CONTEXTS));
		queryResult.setIntent(INTENT);
		queryResult.setIntentDetectionConfidence(INTENT_DETECTION_COFIDENCE);
		queryResult.setDiagnosticInfo(DIAGNOSTIC_INFO);
		queryResult.setLanguageCode(LANGUAGE_CODE);
    }
	
	@Test
	public void testQueryResult() {
		assertAll("queryResult",
				() -> assertEquals(QUERY_TEXT, queryResult.getQueryText()),
	            () -> assertEquals(PARAMETER, queryResult.getParameters()),
	            () -> assertEquals(ALL_REQUIRED_PARAMS_PRESENT, queryResult.getAllRequiredParamsPresent()),
	            () -> assertEquals(FULLFILLMENTTEXT, queryResult.getFulfillmentText()),
	            () -> assertEquals(Arrays.asList(MESSAGES, MESSAGES), queryResult.getFulfillmentMessages()),
	            () -> assertEquals(Arrays.asList(OUTPUT_CONTEXTS, OUTPUT_CONTEXTS), queryResult.getOutputContexts()),
	            () -> assertEquals(INTENT, queryResult.getIntent()),
	            () -> assertEquals(INTENT_DETECTION_COFIDENCE, queryResult.getIntentDetectionConfidence()),
	            () -> assertEquals(DIAGNOSTIC_INFO, queryResult.getDiagnosticInfo()),
	            () -> assertEquals(LANGUAGE_CODE, queryResult.getLanguageCode())
	            );
	}
	
	@Test
	public void testToString() {
		assertNotNull(queryResult.toString());
	}
}
