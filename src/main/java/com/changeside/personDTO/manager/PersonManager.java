package com.changeside.personDTO.manager;

import com.changeside.personDTO.dto.PersonDTO;
import com.changeside.personDTO.entities.Person;
import com.changeside.personDTO.repository.PersonRepository;
import com.changeside.personDTO.services.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PersonManager implements PersonService{
private final PersonRepository personRepository;
    @Override
    public List<PersonDTO> people() {
        return personRepository.findAll().stream().map(person -> new PersonDTO(person.getName(),
                person.getSurName(), person.getEmail())).collect(Collectors.toList());
    }

    @Override
    public PersonDTO getById(Long id) {

        return personRepository.findById(id).stream().map(person -> new PersonDTO(person.getName(),
                person.getSurName(), person.getEmail())).findFirst().get();
    }

    @Override
    public PersonDTO create(Person person) {

         personRepository.save(person);
        PersonDTO personDTO=new PersonDTO();
        personDTO.setEmail(person.getEmail());
        personDTO.setName(person.getName());
        personDTO.setEmail(person.getSurName());
        return personDTO;
    }
}
