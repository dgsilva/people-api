package br.person.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping
	public List<Person>findAll(){
		return personRepository.findAll();
	}
	@PostMapping
	public Person create(@RequestBody Person person) {
		Person personSave = personRepository.save(person);
		return personSave;
	}
}
