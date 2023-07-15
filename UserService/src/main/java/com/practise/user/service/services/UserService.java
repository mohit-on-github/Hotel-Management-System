package com.practise.user.service.services;

import com.practise.user.service.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public User saveUser(User user);
    public List<User> getAllUsers();
    public User getSingleUser(String userId);
}
