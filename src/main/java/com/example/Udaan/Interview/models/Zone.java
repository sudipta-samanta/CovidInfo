package com.example.Udaan.Interview.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Zone {
    @Id
    private int id;
    private String pinCode;
    private int noOfCases;

    public Zone() {
    }

    public int getId() {
        return id;
    }

    public String getPinCode() {
        return pinCode;
    }

    public int getNoOfCases() {
        return noOfCases;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public void setNoOfCases(int noOfCases) {
        this.noOfCases = noOfCases;
    }
}
