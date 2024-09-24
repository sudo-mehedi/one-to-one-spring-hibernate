package com.winrysoft.learndb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winrysoft.learndb.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
    
}
