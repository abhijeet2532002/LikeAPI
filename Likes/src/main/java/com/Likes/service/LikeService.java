package com.Likes.service;

import com.Likes.entity.LikeEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface LikeService {
    List<LikeEntity> getAllLikes();
    Optional<LikeEntity> getLikes(String id);
    LikeEntity getLikesByUserIdAndImageId(String userId,String imageId);
    List<LikeEntity> getLikesByUserId(String userId);
    LikeEntity saveLikes(LikeEntity like);
}
