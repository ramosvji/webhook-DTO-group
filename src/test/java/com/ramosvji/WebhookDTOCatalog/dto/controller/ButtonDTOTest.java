package com.ramosvji.WebhookDTOCatalog.dto.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ButtonDTOTest {
	private static final String TEXT = "button test";
	private static final String POSTBACK = "https://example.com/path/for/end-user/to/follow";
	
	private static ButtonDTO button;
	
	@BeforeAll
    public static void init() {
		button = new ButtonDTO();
		
		button.setText(TEXT);
		button.setPostback(POSTBACK);
    }
	
	@Test
	public void testButton() {
		assertAll("button",
				() -> assertEquals(TEXT, button.getText()),
	            () -> assertEquals(POSTBACK, button.getPostback())
	            );
	}
	
	@Test
	public void testToString() {
		assertNotNull(button.toString());
	}

}
