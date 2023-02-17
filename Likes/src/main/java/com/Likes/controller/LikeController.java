package com.Likes.controller;

import com.Likes.entity.LikeEntity;
import com.Likes.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/likes")
public class LikeController {
    @Autowired
    private LikeService likeService;

    @GetMapping
    public List<LikeEntity> getAllLikes() {
        return likeService.getAllLikes();
    }

    @GetMapping("/{id}")
    public Optional<LikeEntity> getLikes(@PathVariable String id) {
        return likeService.getLikes(id);
    }

    @GetMapping("/user/{id}")
    public List<LikeEntity> getLikeByUserId(@PathVariable String id) {
        return likeService.getLikesByUserId(id);
    }
    @GetMapping("/check")
    public LikeEntity getLikeByUserIdAndImageId(@RequestBody LikeEntity like) {
        return likeService.getLikesByUserIdAndImageId(like.getUserId(), like.getImageId());
    }

    @PostMapping
    public LikeEntity addLikes(@RequestBody LikeEntity like) {
        return likeService.saveLikes(like);
    }
}
