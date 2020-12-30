package com.ramosvji.WebhookDTOCatalog.dto.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StatusDTOTest {
	private static final Integer CODE = 206;
	private static final String ERROR_TYPE = "webhook call failed with %error Code% error";

	private static StatusDTO status;
	
	@BeforeAll
    public static void init() {
		status = new StatusDTO();
		
		status.setCode(CODE);
		status.setErrorType(ERROR_TYPE);
    }
	
	@Test
	public void testStatus() {
		assertAll("status",
				() -> assertEquals(CODE, status.getCode()),
	            () -> assertEquals(ERROR_TYPE, status.getErrorType())
	            );
	}
	
	@Test
	public void testToString() {
		assertNotNull(status.toString());
	}
}
