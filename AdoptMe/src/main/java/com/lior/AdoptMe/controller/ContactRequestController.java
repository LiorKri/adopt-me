package com.lior.AdoptMe.controller;

import com.lior.AdoptMe.entitiy.ContactRequest;
import com.lior.AdoptMe.service.ContactRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact-request")
public class ContactRequestController {

    private final ContactRequestService contactRequestService;

    @Autowired
    public ContactRequestController(ContactRequestService contactRequestService) {
        this.contactRequestService = contactRequestService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<ContactRequest>> getAllContactRequest() {
        List<ContactRequest> contactRequests = contactRequestService.findAllContactRequests();
        return new ResponseEntity<>(contactRequests, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<ContactRequest> addContactRequest(@RequestBody ContactRequest contactRequest) {
        ContactRequest newContactRequest = contactRequestService.addContactRequest(contactRequest);
        return new ResponseEntity<>(newContactRequest, HttpStatus.CREATED);
    }
}
