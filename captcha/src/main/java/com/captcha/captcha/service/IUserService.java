package com.captcha.captcha.service;

import com.captcha.captcha.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IUserService {
    void createUser(User user);
    List<User> getAllUsers();
    Optional<User> getOneUser(Integer Id);
}
