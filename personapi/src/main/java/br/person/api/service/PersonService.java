package br.person.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import br.person.api.dto.MessageResponseDTO;
import br.person.api.entity.Person;
import br.person.api.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	
	public MessageResponseDTO create(@RequestBody Person person) {
		Person personSave = personRepository.save(person);
		return MessageResponseDTO
				.builder()
				.message("Seu cadastro foi realizado " + personSave.getId())
				.build();
	}
	
	
}
