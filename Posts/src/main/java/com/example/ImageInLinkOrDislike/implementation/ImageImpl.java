package com.example.ImageInLinkOrDislike.implementation;

import com.example.ImageInLinkOrDislike.entity.ImageEntity;
import com.example.ImageInLinkOrDislike.repository.ImageRepository;
import com.example.ImageInLinkOrDislike.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ImageImpl implements ImageService {
    @Autowired
    private ImageRepository imageRepository;

    @Override
    public List<ImageEntity> getAllImage() {
        return imageRepository.findAll();
    }

    @Override
    public Optional<ImageEntity> getImage(String id) {
        return imageRepository.findById(id);
    }

    @Override
    public ImageEntity saveImage(ImageEntity image) {
        image.setId(UUID.randomUUID().toString());
        return imageRepository.save(image);
    }
}
