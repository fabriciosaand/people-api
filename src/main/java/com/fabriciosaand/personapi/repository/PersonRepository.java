package com.fabriciosaand.personapi.repository;

import com.fabriciosaand.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
