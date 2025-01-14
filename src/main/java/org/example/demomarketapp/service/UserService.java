package org.example.demomarketapp.service;

import org.example.demomarketapp.dto.UserDto;
import org.example.demomarketapp.model.User;

public interface UserService {
   UserDto create(UserDto dto);
   User getByEmail(String email);
}
