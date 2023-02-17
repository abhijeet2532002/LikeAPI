package com.Likes.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LikeEntity {
    @Id
    private String id;
    @Column(nullable = false)
    private String userId;
    @Column(nullable = false)
    private String imageId;
}
