package com.example.UserInLinkOrDislike.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Likes {
    private String id;
    private String userId;
    private String imageId;
    private Image image = new Image();
}
