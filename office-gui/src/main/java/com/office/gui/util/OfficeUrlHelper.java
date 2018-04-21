package com.office.gui.util;


public class OfficeUrlHelper {
	
	
	public static String getOfficeServiceHost() {
		return "office-service";
	}
	
	public static String getOfficeSocialHost() {
		return "office-social";
	}
	
	public static String concatenateUrl(String hostName, String url) {
		return hostName + "/" + url;
	}
	
	public static String FIND_ALL_OF_TASK = concatenateUrl(getOfficeServiceHost(), "task/");
	public static String FIND_TASK_BY_ID = concatenateUrl(getOfficeServiceHost(), "task/");
	public static String FIND_TASK_BY_PROJECT_ID = concatenateUrl(getOfficeServiceHost(), "task/project/");
	
	
	public static String FIND_ALL_OF_PROJECT = concatenateUrl(getOfficeServiceHost(), "project/");
	public static String FIND_PROJECT_BY_ID = concatenateUrl(getOfficeServiceHost(), "project/");
	
	
	public static String FIND_ALL_OF_PERSON = concatenateUrl(getOfficeServiceHost(), "person/");
	public static String FIND_PERSON_BY_ID = concatenateUrl(getOfficeServiceHost(), "person/");
	
	
	
}
