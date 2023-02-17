package com.example.ImageInLinkOrDislike.controller;

import com.example.ImageInLinkOrDislike.entity.ImageEntity;
import com.example.ImageInLinkOrDislike.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/image")
public class ImageController {
    @Autowired
    private ImageService imageService;

    @GetMapping
    public List<ImageEntity> getAllImage() {
        return imageService.getAllImage();
    }

    @GetMapping("/{id}")
    public Optional<ImageEntity> getImage(@PathVariable String id) {
        return imageService.getImage(id);
    }

    @PostMapping
    public ImageEntity saveImage(@RequestBody ImageEntity image) {
        return imageService.saveImage(image);
    }
}
