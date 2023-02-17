package com.example.UserInLinkOrDislike.repository;

import com.example.UserInLinkOrDislike.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,String> {
}
