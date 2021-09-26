package com.example.Udaan.Interview.models;

public class UpdateCovidData {
    private int userId;
    private int adminId;
    private String result;

    public UpdateCovidData() {
    }

    public UpdateCovidData(int userId, int adminId, String result) {
        this.userId = userId;
        this.adminId = adminId;
        this.result = result;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
