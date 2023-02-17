package com.example.UserInLinkOrDislike.service;

import com.example.UserInLinkOrDislike.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    List<UserEntity> getAllUser();
    UserEntity getUser(String id);
    UserEntity saveUser(UserEntity userEntity);
}
