package com.changeside.personDTO.services;

import com.changeside.personDTO.dto.PersonDTO;
import com.changeside.personDTO.entities.Person;

import java.util.List;

public interface PersonService{
    List<PersonDTO> people();
    PersonDTO getById(Long id);
    PersonDTO create(Person person);


}
