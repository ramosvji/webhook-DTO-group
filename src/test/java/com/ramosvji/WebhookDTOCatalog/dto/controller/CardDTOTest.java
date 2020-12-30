package com.ramosvji.WebhookDTOCatalog.dto.controller;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CardDTOTest {
	private static final String TITLE = "title";
	private static final String SUBTITLE = "subititle";
	private static final String IMAGE_URI = "https://example.com/images/example.png";
	private static final ButtonDTO BUTTON = new ButtonDTO();
	
	private static CardDTO card;
	
	@BeforeAll
	public static void init() {
		card = new CardDTO();
		
		card.setTitle(TITLE);
		card.setSubtitle(SUBTITLE);
		card.setImageUri(IMAGE_URI);
		card.setButtons(Arrays.asList(BUTTON, BUTTON));
	}
	
	@Test
	public void testCard() {
		assertAll("card",
				() -> assertEquals(TITLE, card.getTitle()),
	            () -> assertEquals(SUBTITLE, card.getSubtitle()),
	            () -> assertEquals(IMAGE_URI, card.getImageUri()),
	            () -> assertEquals(Arrays.asList(BUTTON, BUTTON), card.getButtons())            
	            );
	}
	
	@Test
	public void testToString() {
		assertNotNull(card.toString());
	}
}
