package com.example.ImageInLinkOrDislike.service;

import com.example.ImageInLinkOrDislike.entity.ImageEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ImageService {
    List<ImageEntity> getAllImage();
    Optional<ImageEntity> getImage(String id);
    ImageEntity saveImage(ImageEntity image);
}
