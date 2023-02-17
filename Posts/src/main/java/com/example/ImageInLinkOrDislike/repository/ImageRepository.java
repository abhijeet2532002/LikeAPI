package com.example.ImageInLinkOrDislike.repository;

import com.example.ImageInLinkOrDislike.entity.ImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<ImageEntity,String> {
}