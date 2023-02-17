package com.example.UserInLinkOrDislike.contoller;

import com.example.UserInLinkOrDislike.entity.UserEntity;
import com.example.UserInLinkOrDislike.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserEntity> getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping("/{id}")
    public UserEntity getUser(@PathVariable String id) {
        return userService.getUser(id);
    }

    @PostMapping("/add")
    public UserEntity saveUser(@RequestBody UserEntity user) {
        return userService.saveUser(user);
    }
}
