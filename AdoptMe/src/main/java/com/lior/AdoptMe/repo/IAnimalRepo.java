package com.lior.AdoptMe.repo;

import com.lior.AdoptMe.entitiy.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IAnimalRepo extends JpaRepository<Animal, Long> {

    void deleteAnimalById(Long id);

    Optional<Animal> findAnimalById(Long id);
}
