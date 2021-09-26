package com.example.Udaan.Interview.services;

import com.example.Udaan.Interview.models.Role;
import com.example.Udaan.Interview.models.UpdateCovidData;
import com.example.Udaan.Interview.models.User;
import com.example.Udaan.Interview.repositories.AdminRepository;
import com.example.Udaan.Interview.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    AdminRepository repository;

    @Autowired
    UserRepository userRepository;

    public void userRegistration(User user) {
        user.setRole(Role.ADMIN.toString());
        user = repository.save(user);
    }

    public boolean updateCovidData(UpdateCovidData data) {
        int userId = data.getUserId();
        int adminId = data.getAdminId();

        Optional<User> adminUserOptional = userRepository.findById(adminId);
        Optional<User> userOptional = userRepository.findById(userId);
        if(!adminUserOptional.isPresent() || !userOptional.isPresent()) return false;

        User adminUser = adminUserOptional.get();
        User user = adminUserOptional.get();
        if(adminUser.getRole().equals(Role.ADMIN.toString())){
            user.setResult(data.getResult().equals("positive"));
            userRepository.save(user);
            return true;
        }
        return false;
    }
}
