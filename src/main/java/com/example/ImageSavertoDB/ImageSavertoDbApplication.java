package com.example.ImageSavertoDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImageSavertoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImageSavertoDbApplication.class, args);
		System.out.println("---These application was about to save image data to DB---");
	}

}
