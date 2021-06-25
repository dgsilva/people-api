package br.person.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.person.api.entity.Person;
import br.person.api.repository.PersonRepository;

@RestController
@RequestMapping("persons")
public class PersonController {

	@Autowired
	private PersonRepository personRepository;
	
	@PostMapping
	public Person create(@RequestBody Person person) {
		Person personSave = personRepository.save(person);
		return personSave;
	}
}
