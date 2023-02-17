package com.Likes.repository;

import com.Likes.entity.LikeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LikeRepository extends JpaRepository<LikeEntity,String> {
    LikeEntity findByUserIdAndImageId(String userId,String imageId);
    List<LikeEntity> findByUserId(String userId);
}
