package com.office.service.service.declaration;

import com.office.service.model.Result;

public interface ProjectService {
	
	Result findAllOfProject();

	Result findProjectById(Long projectId);
}
