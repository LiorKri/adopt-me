package com.lior.AdoptMe.repo;

import com.lior.AdoptMe.entitiy.ContactRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IContactRequestRepo extends JpaRepository<ContactRequest, Long> {

    void deleteContactRequestById(Long id);

    Optional<ContactRequest> findContactRequestById(Long id);
}
