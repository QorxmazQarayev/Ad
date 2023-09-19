package com.changeside.personDTO.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
////@FieldDefaults(level = AccessLevel.PRIVATE)
//@Entity
@Data
@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String name;
    private String surName;
    private  String email;
    private String createBuy;
    private String modifiedBy;


}
