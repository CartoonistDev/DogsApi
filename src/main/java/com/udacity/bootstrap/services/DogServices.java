package com.udacity.bootstrap.services;

import com.udacity.bootstrap.entity.Dog;

import java.util.List;

public interface DogServices {

    List<Dog> retrieveDogs();
    List<String> retrieveDogBreed();
    String retrieveDogBreedById(Long id);
    List<String> retrieveDogNames();

}
