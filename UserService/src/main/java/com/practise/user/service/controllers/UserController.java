package com.practise.user.service.controllers;

import com.practise.user.service.entities.User;
import com.practise.user.service.exceptions.ResourceNotFoundException;
import com.practise.user.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody User user){
        User savedUser = userService.saveUser(user);

//        return new ResponseEntity<>(savedUser,HttpStatus.OK);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
    }

    @PostMapping("/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable String userId){
        User user = userService.getSingleUser(userId);
        return ResponseEntity.status(HttpStatus.FOUND).body(user);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
//        try {
            List<User> allUsers = userService.getAllUsers();
            return ResponseEntity. status(HttpStatus.FOUND).body(allUsers);
//        }catch (NullPointerException e){
//            throw new ResourceNotFoundException("No Users present!!");
//        }

    }
}
