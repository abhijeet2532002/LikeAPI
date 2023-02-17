package com.Likes.implementation;

import com.Likes.entity.LikeEntity;
import com.Likes.repository.LikeRepository;
import com.Likes.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class LikeImpl implements LikeService {
    @Autowired
    private LikeRepository repository;

    @Override
    public List<LikeEntity> getAllLikes() {
        return repository.findAll();
    }

    @Override
    public Optional<LikeEntity> getLikes(String id) {
        return repository.findById(id);
    }

    @Override
    public LikeEntity getLikesByUserIdAndImageId(String userId, String imageId) {
        return repository.findByUserIdAndImageId(userId, imageId);
    }

    @Override
    public List<LikeEntity> getLikesByUserId(String userId) {
        return repository.findByUserId(userId);
    }

    @Override
    public LikeEntity saveLikes(LikeEntity like) {
        LikeEntity byUserIdAndImageId = repository.findByUserIdAndImageId(like.getUserId(), like.getImageId());
        if (byUserIdAndImageId == null) {
            like.setId(UUID.randomUUID().toString());
            return repository.save(like);
        } else {
            return (LikeEntity) ResponseEntity.badRequest();
        }
    }
}
