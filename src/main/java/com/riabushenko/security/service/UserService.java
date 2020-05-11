package com.riabushenko.security.service;


import com.riabushenko.security.model.User;
import com.riabushenko.security.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;



public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}