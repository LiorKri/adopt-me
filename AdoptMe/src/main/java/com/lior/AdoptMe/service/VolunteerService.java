package com.lior.AdoptMe.service;

import com.lior.AdoptMe.entitiy.Volunteer;
import com.lior.AdoptMe.repo.IVolunteerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VolunteerService {

    private final IVolunteerRepo volunteerRepo;

    @Autowired
    public VolunteerService(IVolunteerRepo volunteerRepo) {
        this.volunteerRepo = volunteerRepo;
    }

    public Volunteer addVolunteer(Volunteer volunteer) {
        return volunteerRepo.save(volunteer);
    }

    public List<Volunteer> findAllVolunteers() {
        return volunteerRepo.findAll();
    }

    public Volunteer updateVolunteer(Volunteer volunteer) {
        return volunteerRepo.save(volunteer);
    }
}
