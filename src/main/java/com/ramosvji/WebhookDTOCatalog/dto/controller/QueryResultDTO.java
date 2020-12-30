package com.ramosvji.WebhookDTOCatalog.dto.controller;

import java.io.Serializable;
import java.util.List;

public class QueryResultDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String queryText;
	private ParameterDTO parameters;
	private Boolean allRequiredParamsPresent;
	private String fulfillmentText;
	private List<FulfillmentMessagesDTO> fulfillmentMessages;
	private List<OutputContextsDTO> outputContexts;
	private IntentDTO intent;
	private Integer intentDetectionConfidence;
	private DiagnosticInfoDTO diagnosticInfo;
	private String languageCode;
	
	public String getQueryText() {
		return queryText;
	}
	
	public void setQueryText(String queryText) {
		this.queryText = queryText;
	}
	
	public ParameterDTO getParameters() {
		return parameters;
	}
	
	public void setParameters(ParameterDTO parameters) {
		this.parameters = parameters;
	}
	
	public Boolean getAllRequiredParamsPresent() {
		return allRequiredParamsPresent;
	}
	
	public void setAllRequiredParamsPresent(Boolean allRequiredParamsPresent) {
		this.allRequiredParamsPresent = allRequiredParamsPresent;
	}
	
	public String getFulfillmentText() {
		return fulfillmentText;
	}
	
	public void setFulfillmentText(String fulfillmentText) {
		this.fulfillmentText = fulfillmentText;
	}
	
	public List<FulfillmentMessagesDTO> getFulfillmentMessages() {
		return fulfillmentMessages;
	}

	public void setFulfillmentMessages(List<FulfillmentMessagesDTO> fulfillmentMessages) {
		this.fulfillmentMessages = fulfillmentMessages;
	}

	public List<OutputContextsDTO> getOutputContexts() {
		return outputContexts;
	}

	public void setOutputContexts(List<OutputContextsDTO> outputContexts) {
		this.outputContexts = outputContexts;
	}

	public IntentDTO getIntent() {
		return intent;
	}
	
	public void setIntent(IntentDTO intent) {
		this.intent = intent;
	}
	
	public Integer getIntentDetectionConfidence() {
		return intentDetectionConfidence;
	}
	
	public void setIntentDetectionConfidence(Integer intentDetectionConfidence) {
		this.intentDetectionConfidence = intentDetectionConfidence;
	}
	
	public DiagnosticInfoDTO getDiagnosticInfo() {
		return diagnosticInfo;
	}
	
	public void setDiagnosticInfo(DiagnosticInfoDTO diagnosticInfo) {
		this.diagnosticInfo = diagnosticInfo;
	}
	
	public String getLanguageCode() {
		return languageCode;
	}
	
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	@Override
	public String toString() {
		return "QueryResultDTO [queryText=" + queryText + ", parameters=" + parameters + ", allRequiredParamsPresent="
				+ allRequiredParamsPresent + ", fulfillmentText=" + fulfillmentText + ", fulfillmentMessages="
				+ fulfillmentMessages + ", outputContexts=" + outputContexts + ", intent=" + intent
				+ ", intentDetectionConfidence=" + intentDetectionConfidence + ", diagnosticInfo=" + diagnosticInfo
				+ ", languageCode=" + languageCode + "]";
	}

}
