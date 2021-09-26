package com.example.Udaan.Interview.models;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class UserSymptom {

    @Id
    private int userId;

    @ElementCollection
    private List<String> symptoms;

    public UserSymptom() {
    }

    public UserSymptom(List<String> symptoms) {
        this.symptoms = symptoms;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<String> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(List<String> symptoms) {
        this.symptoms = symptoms;
    }
}
