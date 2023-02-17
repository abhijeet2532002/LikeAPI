package com.example.UserInLinkOrDislike.externalService;

import com.example.UserInLinkOrDislike.entity.Image;
import com.example.UserInLinkOrDislike.entity.Likes;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "LIKE-SERVICE")
public interface LikeService {
    @GetMapping("/likes/user/{id}")
    public List<Likes> getLikesByUserId(@PathVariable String id);
}
