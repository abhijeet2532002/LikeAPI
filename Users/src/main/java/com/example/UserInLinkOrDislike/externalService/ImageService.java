package com.example.UserInLinkOrDislike.externalService;

import com.example.UserInLinkOrDislike.entity.Image;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "IMAGE-SERVICE")
public interface ImageService {

    @GetMapping("/image/{id}")
    public Image getImage(@PathVariable String id);
}
