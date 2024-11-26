package com.example.ImageSavertoDB.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ImageSavertoDB.entity.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
