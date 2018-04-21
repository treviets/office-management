package com.office.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.office.service.service.declaration.PersonService;


@Controller
@RequestMapping("person")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping(path = "/")
	@ResponseBody
	public Object findAllOfPerson() {
		return personService.findAllOfPerson();
	}
	
	@GetMapping(path = "/{personId}")
	@ResponseBody
	public Object findPersonById(@PathVariable Long personId) {
		return personService.findPersonById(personId);
	}
	
	
}
