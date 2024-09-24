package com.winrysoft.learndb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winrysoft.learndb.entity.Address;

@Repository
public interface AddressRepository extends  JpaRepository<Address, Integer>{
    
}
