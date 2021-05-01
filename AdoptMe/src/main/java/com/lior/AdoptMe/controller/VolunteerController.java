package com.lior.AdoptMe.controller;

import com.lior.AdoptMe.entitiy.Volunteer;
import com.lior.AdoptMe.service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/volunteer")
public class VolunteerController {

    private final VolunteerService volunteerService;

    @Autowired
    public VolunteerController(VolunteerService volunteerService) {
        this.volunteerService = volunteerService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Volunteer>> getAllVolunteers() {
        List<Volunteer> volunteers = volunteerService.findAllVolunteers();
        return new ResponseEntity<>(volunteers, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Volunteer> addVolunteer(@RequestBody Volunteer volunteer) {
        Volunteer newVolunteer = volunteerService.addVolunteer(volunteer);
        return new ResponseEntity<>(newVolunteer, HttpStatus.CREATED);
    }
}
