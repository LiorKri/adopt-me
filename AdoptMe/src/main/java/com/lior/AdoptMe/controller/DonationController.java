package com.lior.AdoptMe.controller;

import com.lior.AdoptMe.entitiy.Donation;
import com.lior.AdoptMe.service.DonationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/donation")
public class DonationController {

    private final DonationService donationService;

    @Autowired
    public DonationController(DonationService donationService) {
        this.donationService = donationService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Donation>> getAllDonations() {
        List<Donation> donations = donationService.findAllDonations();
        return new ResponseEntity<>(donations, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Donation> addDonation(@RequestBody Donation donation) {
        Donation newDonation = donationService.addDonation(donation);
        return new ResponseEntity<>(newDonation, HttpStatus.CREATED);
    }
}
