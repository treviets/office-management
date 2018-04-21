package com.office.service.service.implementation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.office.service.dao.PersonRepository;
import com.office.service.model.Result;
import com.office.service.model.Person;
import com.office.service.service.declaration.PersonService;

@Service
public class PersonServiceImp implements PersonService {
	
	@Autowired PersonRepository personRepository;
	
	@Override
	@Transactional
	public Result findAllOfPerson() {
		final List<Person> listOfPersons = (List<Person>) personRepository.findAll();
		final Map<String, Object> result = new HashMap<String, Object>();
		result.put("person", listOfPersons);
		
		return new Result(result, true);
	}

	@Override
	public Result findPersonById(Long personId) {
		return null;
	}

	

}
