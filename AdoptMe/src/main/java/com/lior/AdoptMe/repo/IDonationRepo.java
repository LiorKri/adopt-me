package com.lior.AdoptMe.repo;

import com.lior.AdoptMe.entitiy.Donation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IDonationRepo extends JpaRepository<Donation, Long> {

    void deleteDonationById(Long id);

    Optional<Donation> findDonationById(Long id);
}
