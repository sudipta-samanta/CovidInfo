package com.example.Udaan.Interview.controllers;

import com.example.Udaan.Interview.models.UpdateCovidData;
import com.example.Udaan.Interview.models.User;
import com.example.Udaan.Interview.services.AdminService;
import com.example.Udaan.Interview.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AdminController {
    @Autowired
    AdminService service;

    @PostMapping("/registerAdmin")
    public Map<String, String> adminRegistration(@RequestBody User user){
        service.userRegistration(user);
        Map<String, String> map = new HashMap<>();
        map.put("adminId", Integer.toString(user.getId()));
        return map;
    }

    @PostMapping("/updateCovidResult")
    public Map<String, Boolean> updateCovidResult(@RequestBody UpdateCovidData data){
        boolean isUpdated = service.updateCovidData(data);
        Map<String, Boolean> map = new HashMap<>();
        map.put("updated", isUpdated);
        return map;
    }
}
