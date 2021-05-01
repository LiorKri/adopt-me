package com.lior.AdoptMe.service;

import com.lior.AdoptMe.entitiy.ContactRequest;
import com.lior.AdoptMe.repo.IContactRequestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactRequestService {

    private final IContactRequestRepo contactRequestRepo;

    @Autowired
    public ContactRequestService(IContactRequestRepo contactRequestRepo) {
        this.contactRequestRepo = contactRequestRepo;
    }

    public ContactRequest addContactRequest(ContactRequest contactRequest) {
        return contactRequestRepo.save(contactRequest);
    }

    public List<ContactRequest> findAllContactRequests() {
        return contactRequestRepo.findAll();
    }

    public ContactRequest updateContactRequest(ContactRequest contactRequest) {
        return contactRequestRepo.save(contactRequest);
    }
}
