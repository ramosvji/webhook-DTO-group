package com.ramosvji.WebhookDTOCatalog.dto.controller.v1;

import java.io.Serializable;

import com.ramosvji.WebhookDTOCatalog.dto.controller.OriginalDetectIntentRequestDTO;
import com.ramosvji.WebhookDTOCatalog.dto.controller.QueryResultDTO;

public class WebhookRequestDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String responseId;
	private String session;
	private QueryResultDTO queryResult;
	private OriginalDetectIntentRequestDTO originalDetectIntentRequest;
	
	public String getResponseId() {
		return responseId;
	}
	
	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}
	
	public String getSession() {
		return session;
	}
	
	public void setSession(String session) {
		this.session = session;
	}
	
	public QueryResultDTO getQueryResult() {
		return queryResult;
	}
	
	public void setQueryResult(QueryResultDTO queryResult) {
		this.queryResult = queryResult;
	}
	
	public OriginalDetectIntentRequestDTO getOriginalDetectIntentRequest() {
		return originalDetectIntentRequest;
	}
	
	public void setOriginalDetectIntentRequest(OriginalDetectIntentRequestDTO originalDetectIntentRequest) {
		this.originalDetectIntentRequest = originalDetectIntentRequest;
	}

	@Override
	public String toString() {
		return "WebhookRequestDTO [responseId=" + responseId + ", session=" + session + ", queryResult=" + queryResult
				+ ", originalDetectIntentRequest=" + originalDetectIntentRequest + "]";
	}
}
