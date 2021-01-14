package com.hackathon3.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackathon3.api.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
