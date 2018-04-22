package com.office.gui.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("sprint")
public class SprintController extends BaseController {
	
	@GetMapping(path = "/detail/")
	public String viewProjectDetail() {
		// Get Detail Information of Sprint by Id
		/*
		 * Not yet implement
		 */
		
		
		// Return to view
		return "sprint-detail";
	}

	
}
