package com.office.service.service.declaration;

import com.office.service.model.Result;

public interface PersonService {
	
	Result findAllOfPerson();
	
	Result findPersonById(Long personId);
}
