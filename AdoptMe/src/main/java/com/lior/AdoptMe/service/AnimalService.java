package com.lior.AdoptMe.service;

import com.lior.AdoptMe.entitiy.Animal;
import com.lior.AdoptMe.exception.AnimalNotFoundException;
import com.lior.AdoptMe.repo.IAnimalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AnimalService {

    private final IAnimalRepo animalRepo;

    @Autowired
    public AnimalService(IAnimalRepo animalRepo) {
        this.animalRepo = animalRepo;
    }

    public Animal addAnimal(Animal animal) {
        return animalRepo.save(animal);
    }

    public List<Animal> findAllAnimals() {
        return animalRepo.findAll();
    }

    public Animal updateAnimal(Animal animal) {
        return animalRepo.save(animal);
    }

    public Animal findAnimalById(Long id) {
        return animalRepo.findAnimalById(id).orElseThrow(() -> new AnimalNotFoundException("Animal by id " + id + " not found"));
    }

    @Transactional
    public void deleteAnimal(Long id) {
        animalRepo.deleteAnimalById(id);
    }
}
