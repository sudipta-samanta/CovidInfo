package com.example.Udaan.Interview.controllers;

import com.example.Udaan.Interview.models.User;
import com.example.Udaan.Interview.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    UserService service;

    @PostMapping("/registerUser")
    public Map<String, String> userRegistration(@RequestBody User user){
        User regUser = service.userRegistration(user);

        Map<String, String> map = new HashMap<>();
        map.put("userId", Integer.toString(user.getId()));
        return map;
    }

    @PostMapping("/selfAssessment/")
    public Map<String, Integer> doSelfAssessment(@RequestBody User user){
        int precentage = service.doSelfAssessment(user);
        Map<String, Integer> map = new HashMap<>();
        map.put("riskPercentage", precentage);
        return map;
    }
}
