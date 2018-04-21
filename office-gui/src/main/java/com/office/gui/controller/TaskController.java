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
@RequestMapping("task")
public class TaskController extends BaseController {
	
	@GetMapping(path = "/")
	@ResponseBody
	public Object findAllOfTask(HttpServletRequest request) {
		String findAllTaskUrl = getMainDomain(request) + OfficeUrlHelper.FIND_ALL_OF_TASK;
		
		Map<String, Object> result = new HashMap<String, Object>();
		Object tasks = OfficeRestApiHelper.get(findAllTaskUrl, result);
		
		return tasks;
	}
	
	@GetMapping(path = "/{taskId}")
	@ResponseBody
	public Object findTaskById(HttpServletRequest request, @PathVariable Long taskId) {
		String findTaskByIdUrl = getMainDomain(request) + OfficeUrlHelper.FIND_TASK_BY_ID + taskId;
		
		Map<String, Object> result = new HashMap<String, Object>();
		Object task = OfficeRestApiHelper.get(findTaskByIdUrl, result);
		
		return task;
	}
	
	@GetMapping(path = "/project/{projectId}")
	@ResponseBody
	public Object findTaskByProjectId(HttpServletRequest request, @PathVariable Long projectId) {
		String findTaskByProjectIdUrl = getMainDomain(request) + OfficeUrlHelper.FIND_TASK_BY_PROJECT_ID + projectId;
		
		Map<String, Object> result = new HashMap<String, Object>();
		Object tasks = OfficeRestApiHelper.get(findTaskByProjectIdUrl, result);
		
		return tasks;
	}
	
	
	
}
