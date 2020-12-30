package com.ramosvji.WebhookDTOCatalog.dto.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ParameterDTOTest {
	private static final String PARAM_NAME = "param-value";
	
	private static ParameterDTO parameter;
	
	@BeforeAll
    public static void init() {
		parameter = new ParameterDTO();
		
		parameter.setParamName(PARAM_NAME);
    }
	
	@Test
	public void testParameter() {
		assertEquals(PARAM_NAME, parameter.getParamName());
	}
	
	@Test
	public void testToString() {
		assertNotNull(parameter.toString());
	}
}
