package com.lior.AdoptMe.service;

import com.lior.AdoptMe.entitiy.Donation;
import com.lior.AdoptMe.repo.IDonationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonationService {

    private final IDonationRepo donationRepo;

    @Autowired
    public DonationService(IDonationRepo donationRepo) {
        this.donationRepo = donationRepo;
    }

    public Donation addDonation(Donation donation) {
        return donationRepo.save(donation);
    }

    public List<Donation> findAllDonations() {
        return donationRepo.findAll();
    }

    public Donation updateDonation(Donation donation) {
        return donationRepo.save(donation);
    }
}
