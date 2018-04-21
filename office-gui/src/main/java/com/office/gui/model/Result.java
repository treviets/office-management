package com.office.gui.model;

import java.util.Map;

public class Result {
	
	public static final int STATUS_SUCCESS_FLAG = 1;
	public static final int STATUS_FAILED_FLAG = 0;
	public static final String STATUS_SUCCESS_STRING = "SUCCESS";
	public static final String STATUS_FAILED_STRING = "FAILED";
	
	private int status;
	private String description;
	private Map<?, ?> result;
	
	public Result() {
		
	}
	
	public Result(int status, String description, Map<?, ?> result) {
		this.status = status;
		this.description = description;
		this.result = result;
	}
	
	public Result(Map<?, ?> result, boolean isOkay) {
		this.status = STATUS_FAILED_FLAG;
		this.description = STATUS_FAILED_STRING;
		
		if(isOkay) {
			this.status = STATUS_SUCCESS_FLAG;
			this.description = STATUS_SUCCESS_STRING;
		} 
		
		this.result = result;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Map<?, ?> getResult() {
		return result;
	}

	public void setResult(Map<?, ?> result) {
		this.result = result;
	}
	
	
}
