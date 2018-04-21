package com.office.service.service.declaration;

import com.office.service.model.Result;

public interface TaskService {
	
	Result findAllOfTask();

	Result findTaskByTaskId(Long taskId);
	
	Result findTaskByProjectId(Long projectId);
}
