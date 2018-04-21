package com.office.gui.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * Base Controller
 */
public class BaseController {
	
	public String getMainDomain(HttpServletRequest request) {
		
		if (request != null) {
			StringBuffer url = request.getRequestURL();
			String uri = request.getRequestURI();

			StringBuffer mainDomain = new StringBuffer(url.substring(0, url.indexOf(uri)));
			return mainDomain.toString();
		}
		return null;
	}
}
