package com.lior.AdoptMe.repo;

import com.lior.AdoptMe.entitiy.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUserRepo extends JpaRepository<User, Long> {

    void deleteUserById(Long id);

    Optional<User> findUserById(Long id);

    Optional<User> findUserByEmail(String email);
}
