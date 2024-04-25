package com.ohgiraffers.sessionsecurity.user.model.dto;

public class SignupDTO {

    // html 안에 쓴 name 이랑 메소드 이름이랑 꼭!! 잘 맞추기!!!!
    private String userId;
    private String userName;
    private String userPass;
    private String role;

    public SignupDTO() {
    }

    public SignupDTO(String role, String userPass, String userName, String userId) {
        this.role = role;
        this.userPass = userPass;
        this.userName = userName;
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "SignupDTO{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userPass='" + userPass + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
