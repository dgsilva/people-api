package br.person.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.person.api.dto.MessageResponseDTO;
import br.person.api.entity.Person;
import br.person.api.repository.PersonRepository;
import br.person.api.service.PersonService;

@RestController
@RequestMapping("persons")
public class PersonController {

	@Autowired
	private PersonRepository personRepository;
	@Autowired
	private PersonService PersonService;
	
	@GetMapping
	public List<Person>findAll(){
		return personRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public MessageResponseDTO create(@RequestBody Person person) {
		return  PersonService.create(person);
	}
}
