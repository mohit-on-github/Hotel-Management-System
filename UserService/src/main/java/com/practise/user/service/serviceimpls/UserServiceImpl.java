package com.practise.user.service.serviceimpls;

import com.practise.user.service.entities.User;
import com.practise.user.service.exceptions.ResourceNotFoundException;
import com.practise.user.service.repositories.UserRepo;
import com.practise.user.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.UUID;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public User saveUser(User user) {
        String randomUserId = UUID.randomUUID().toString();
        user.setUserId(randomUserId);
        return  userRepo.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User getSingleUser(String userId) {
        return userRepo.findById(userId).orElseThrow(
                () -> new ResourceNotFoundException("User having userId: "+userId+" not found on server!!"));
    }
}
