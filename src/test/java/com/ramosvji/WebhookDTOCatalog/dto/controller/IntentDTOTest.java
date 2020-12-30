package com.ramosvji.WebhookDTOCatalog.dto.controller;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IntentDTOTest {
	private static final String NAME = "name";
	private static final String DISPLAYNAME= "displayName";
	
	private static IntentDTO intent;
	
	@BeforeAll
    public static void init() {
		intent = new IntentDTO();
		
		intent.setName(NAME);
		intent.setDisplayName(DISPLAYNAME);
    }
	
	@Test
	public void testIntent() {
		assertAll("intent",
				() -> assertEquals(NAME, intent.getName()),
	            () -> assertEquals(DISPLAYNAME, intent.getDisplayName())
	            );
	}
	
	@Test
	public void testToString() {
		assertNotNull(intent.toString());
	}
}
