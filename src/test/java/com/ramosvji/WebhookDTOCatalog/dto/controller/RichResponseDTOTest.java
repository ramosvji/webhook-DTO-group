package com.ramosvji.WebhookDTOCatalog.dto.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RichResponseDTOTest {
	private static final ItemDTO ITEM = new ItemDTO();
	
	private static RichResponseDTO richResponse;
	
	@BeforeAll
	public static void init() {
		richResponse = new RichResponseDTO();
		
		richResponse.setItem(Arrays.asList(ITEM,ITEM));
	}

	@Test
	void testRichResponse() {
		assertEquals(Arrays.asList(ITEM,ITEM), richResponse.getItem());
	}
	
	@Test
	public void testToString() {
		assertNotNull(richResponse.toString());
	}

}
