package com.lior.AdoptMe.repo;

import com.lior.AdoptMe.entitiy.Volunteer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IVolunteerRepo extends JpaRepository<Volunteer, Long> {

    void deleteVolunteerById(Long id);

    Optional<Volunteer> findVolunteerById(Long id);
}
