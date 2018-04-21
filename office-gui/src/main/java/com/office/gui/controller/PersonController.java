package com.office.gui.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.office.gui.util.OfficeRestApiHelper;
import com.office.gui.util.OfficeUrlHelper;

@Controller
@RequestMapping("person")
public class PersonController extends BaseController {
	
	
	@GetMapping(path = "/")
	@ResponseBody
	public Object findAllOfPersons(HttpServletRequest request) {
		String findAllOfPersonsUrl = getMainDomain(request) + OfficeUrlHelper.FIND_ALL_OF_PERSON;
		
		Map<String, Object> result = new HashMap<String, Object>();
		Object projects = OfficeRestApiHelper.get(findAllOfPersonsUrl, result);
		
		return projects;
	}
	
	@GetMapping(path = "/{personId}")
	@ResponseBody
	public Object findPersonbyId(HttpServletRequest request, @PathVariable Long personId) {
		String findPersonbyIdUrl = getMainDomain(request) + OfficeUrlHelper.FIND_PROJECT_BY_ID + personId;
		
		Map<String, Object> result = new HashMap<String, Object>();
		Object project = OfficeRestApiHelper.get(findPersonbyIdUrl, result);
		
		return project;
	}

	
}
