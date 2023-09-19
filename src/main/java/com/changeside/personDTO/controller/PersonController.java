package com.changeside.personDTO.controller;

import com.changeside.personDTO.dto.PersonDTO;
import com.changeside.personDTO.entities.Person;
import com.changeside.personDTO.manager.PersonManager;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people")
@RequiredArgsConstructor
public class PersonController {
    private final PersonManager personManager;
    @GetMapping
    public List<PersonDTO> getAll(){
        return personManager.people();
    }
    @GetMapping({"/id"})
    public PersonDTO getById(@PathVariable Long id){
        return personManager.getById(id);
    }
    @PostMapping
    public PersonDTO create(@RequestBody Person person){
        return personManager.create(person);
    }
}
