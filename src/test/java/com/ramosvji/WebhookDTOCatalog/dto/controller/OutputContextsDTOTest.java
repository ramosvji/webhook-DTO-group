package com.ramosvji.WebhookDTOCatalog.dto.controller;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OutputContextsDTOTest {
	private static final String NAME = "name";
	private static final Integer LIFESPAN_COUNT = 0;
	private static final ParameterDTO PARAMETER = new ParameterDTO();
	
	private static OutputContextsDTO outputContexts;

	@BeforeAll
	public static void init() {
		outputContexts = new OutputContextsDTO();
		
		outputContexts.setName(NAME);
		outputContexts.setLifespanCount(LIFESPAN_COUNT);
		outputContexts.setParameters(PARAMETER);
	}

	@Test
	void testOutputContexts() {
		assertAll("outputContexts",
				() -> assertEquals(NAME, outputContexts.getName()),
	            () -> assertEquals(LIFESPAN_COUNT, outputContexts.getLifespanCount()),
	            () -> assertEquals(PARAMETER, outputContexts.getParameters())
	            );
	}
	
	@Test
	public void testToString() {
		assertNotNull(outputContexts.toString());
	}

}
