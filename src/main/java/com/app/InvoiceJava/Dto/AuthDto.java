package com.app.InvoiceJava.Dto;

import com.app.InvoiceJava.Entity.AuthEntity;

import java.sql.Timestamp;

public class AuthDto {
    private Long id;
    private String name;
    private String email;
    private String password;
    private Long phoneNumber;
    private String address;
    private String userImage;
    private String emailStatus;
    private String emailVerifiedAt;
    private String token;
    private Timestamp createdAt;
    private AuthEntity.UserType usertype;  // ✅ Added
    private Long userId;                   // ✅ Added (only ID to avoid recursion)
    private Long companyId;                // ✅ Added (only ID to avoid huge response)

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public AuthEntity.UserType getUsertype() {
        return usertype;
    }

    public void setUsertype(AuthEntity.UserType usertype) {
        this.usertype = usertype;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getEmailStatus() {
        return emailStatus;
    }

    public void setEmailStatus(String emailStatus) {
        this.emailStatus = emailStatus;
    }

    public String getEmailVerifiedAt() {
        return emailVerifiedAt;
    }

    public void setEmailVerifiedAt(String emailVerifiedAt) {
        this.emailVerifiedAt = emailVerifiedAt;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public AuthDto(AuthEntity authEntity) {
        this.id = authEntity.getId();
        this.name = authEntity.getName();
        this.email = authEntity.getEmail();
        this.password = authEntity.getPassword();
        this.phoneNumber = authEntity.getPhoneNumber();
        this.address = authEntity.getAddress();
        this.userImage = authEntity.getUserImage();
        this.emailStatus = authEntity.getEmailStatus();
        this.emailVerifiedAt = authEntity.getEmailVerifiedAt();
        this.token = authEntity.getToken();
        this.createdAt = authEntity.getCreatedAt();
        this.usertype=authEntity.getUsertype();
        this.userId = authEntity.getUserId() !=null ?authEntity.getUserId().getId() : null;
        this.companyId = authEntity.getCompanyId() != null ? authEntity.getCompanyId().getId() : null;

    }
}
