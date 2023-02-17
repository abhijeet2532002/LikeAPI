package com.example.UserInLinkOrDislike.implementation;

import com.example.UserInLinkOrDislike.entity.Image;
import com.example.UserInLinkOrDislike.entity.Likes;
import com.example.UserInLinkOrDislike.entity.UserEntity;
import com.example.UserInLinkOrDislike.exception.ResourceNotFoundException;
import com.example.UserInLinkOrDislike.externalService.ImageService;
import com.example.UserInLinkOrDislike.externalService.LikeService;
import com.example.UserInLinkOrDislike.repository.UserRepository;
import com.example.UserInLinkOrDislike.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private LikeService likeService;

    @Autowired
    private ImageService imageService;

    @Override
    public List<UserEntity> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity getUser(String id) {
        UserEntity user = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Resource not Available ...."));
        List<Likes> likes = likeService.getLikesByUserId(user.getId());

        List<Likes> like = likes.stream().map(like1->{
            Image image = imageService.getImage(like1.getImageId());
            like1.setImage(image);
            return like1;
        }).collect(Collectors.toList());

        user.setLikes(like);
        return user;
    }

    @Override
    public UserEntity saveUser(UserEntity userEntity) {
        userEntity.setId(UUID.randomUUID().toString());
        return userRepository.save(userEntity);
    }
}
