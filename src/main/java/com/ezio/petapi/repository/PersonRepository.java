package com.ezio.petapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ezio.petapi.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{
}