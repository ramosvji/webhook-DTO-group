package com.ramosvji.WebhookDTOCatalog.dto.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TextDTOTest {
	private static final String TEXT = "text";
	
	private static TextDTO text;
	
	@BeforeAll
	public static void init() {
		text = new TextDTO();
		
		text.setText(Arrays.asList(TEXT, TEXT));
	}

	@Test
	void testTextDto() {
		assertEquals(Arrays.asList(TEXT, TEXT), text.getText());
	}
	
	@Test
	public void testToString() {
		assertNotNull(text.toString());
	}

}
