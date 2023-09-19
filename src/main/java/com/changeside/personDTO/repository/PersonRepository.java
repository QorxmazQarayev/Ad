package com.changeside.personDTO.repository;

import com.changeside.personDTO.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository <Person,Long>{

}
