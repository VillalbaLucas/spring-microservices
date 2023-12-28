package com.microservices.greeting.greeting.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservices.greeting.greeting.dto.UserDto;

@FeignClient(name = "mcsv-apiuser", url = "localhost:8080/api/users/search")
public interface FeignClientUser {
    
    @GetMapping("/{id}")
    UserDto findUser(@PathVariable Long id);
}
