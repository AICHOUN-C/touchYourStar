package com.hackathon3.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackathon3.api.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
