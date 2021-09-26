package com.example.Udaan.Interview.repositories;

import com.example.Udaan.Interview.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    public User findByPhoneNumber(String phoneNumber);
}
