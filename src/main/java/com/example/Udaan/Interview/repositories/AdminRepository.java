package com.example.Udaan.Interview.repositories;

import com.example.Udaan.Interview.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<User, Integer> {

}
