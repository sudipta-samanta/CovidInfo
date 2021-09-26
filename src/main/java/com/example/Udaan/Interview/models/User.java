package com.example.Udaan.Interview.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String phoneNumber;
    private String pinCode;
    private boolean travelHistory;
    private boolean result;
    private String role;
    @OneToOne
    private UserSymptom userSymptom;
    private boolean contactWithCovidPatient;

    public User() {
    }

    public User(String name, String phoneNumber, String pinCode, List<String> symptoms, boolean travelHistory, boolean result, String role) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.pinCode = pinCode;
        this.travelHistory = travelHistory;
        this.result = result;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public boolean isTravelHistory() {
        return travelHistory;
    }

    public void setTravelHistory(boolean travelHistory) {
        this.travelHistory = travelHistory;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public UserSymptom getUserSymptom() {
        return userSymptom;
    }

    public void setUserSymptom(UserSymptom userSymptom) {
        this.userSymptom = userSymptom;
    }

    public boolean isContactWithCovidPatient() {
        return contactWithCovidPatient;
    }

    public void setContactWithCovidPatient(boolean contactWithCovidPatient) {
        this.contactWithCovidPatient = contactWithCovidPatient;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", travelHistory=" + travelHistory +
                ", result=" + result +
                ", role='" + role + '\'' +
                ", userSymptom=" + userSymptom +
                '}';
    }
}
