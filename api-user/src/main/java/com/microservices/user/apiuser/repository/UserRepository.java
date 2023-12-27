package com.microservices.user.apiuser.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.microservices.user.apiuser.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    
}
