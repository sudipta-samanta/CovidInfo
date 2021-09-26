package com.example.Udaan.Interview.services;

import com.example.Udaan.Interview.exceptions.UserAlreadyRegisterdException;
import com.example.Udaan.Interview.models.Role;
import com.example.Udaan.Interview.models.User;
import com.example.Udaan.Interview.models.UserSymptom;
import com.example.Udaan.Interview.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public User userRegistration(User user) {

        User existingUser = repository.findByPhoneNumber(user.getPhoneNumber());
        if(existingUser != null) throw new UserAlreadyRegisterdException("User alread registered");
        user.setRole(Role.USER.toString());
        user = repository.save(user);
        return user;
    }

    public int doSelfAssessment(final User user) {

        UserSymptom userSymptom = user.getUserSymptom();
        boolean travelHistory = user.isTravelHistory();
        boolean contactWithCovidPatient = user.isContactWithCovidPatient();

        if(userSymptom != null && userSymptom.getSymptoms().size() == 0
        && !travelHistory && !contactWithCovidPatient){
            return 5;
        }
        else if(userSymptom != null && userSymptom.getSymptoms().size() == 1
                && (travelHistory == true || contactWithCovidPatient == true)){
            return 50;
        }
        else if(userSymptom != null && userSymptom.getSymptoms().size() == 2
                && (travelHistory == true || contactWithCovidPatient == true)){
            return 75;
        }
        else if(userSymptom != null && userSymptom.getSymptoms().size() > 2
                && (travelHistory == true || contactWithCovidPatient == true)){
            return 95;
        }
        return 0;
    }
}
