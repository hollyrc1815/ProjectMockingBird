package com.tts.TechTalentTwitter.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.TechTalentTwitter.model.User;

@Repository("userRepository")
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
    User findByFirstName(String firstName);
    User findByLastName(String lastName);
    User findByEmailIgnoreCase(String email);
}

