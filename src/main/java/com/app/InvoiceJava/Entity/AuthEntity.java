    package com.app.InvoiceJava.Entity;

    import jakarta.persistence.*;

    import java.sql.Timestamp;
    import java.time.Instant;

    @Entity
    @Table(name = "Auth")
    public class AuthEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
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

        @Enumerated(EnumType.STRING)
        @Column(name = "user_type")
        private UserType usertype;

        public enum UserType {
            OWNER,
            SUBUSER,
            ADMIN
        }
        @PrePersist
        protected  void onCreate(){
            Timestamp now = Timestamp.from(Instant.now());
            this.createdAt = now;
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

        public UserType getUsertype() {
            return usertype;
        }

        public void setUsertype(UserType usertype) {
            this.usertype = usertype;
        }

        public AuthEntity getUserId() {
            return userId;
        }

        public void setUserId(AuthEntity userId) {
            this.userId = userId;
        }

        public AuthEntity(Long id, String name, String password, String email, Long phoneNumber, String address, String userImage, String emailStatus, String emailVerifiedAt, String token, Timestamp createdAt, UserType usertype, AuthEntity userId, CompanyEntity companyId) {
            this.id = id;
            this.name = name;
            this.password = password;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.address = address;
            this.userImage = userImage;
            this.emailStatus = emailStatus;
            this.emailVerifiedAt = emailVerifiedAt;
            this.token = token;
            this.createdAt = createdAt;
            this.usertype = usertype;
            this.userId = userId;
            this.companyId = companyId;
        }

        public CompanyEntity getCompanyId() {
            return companyId;
        }

        public void setCompanyId(CompanyEntity companyId) {
            this.companyId = companyId;
        }
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "userId",referencedColumnName="id",nullable = true )
        private AuthEntity userId;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "companyId",referencedColumnName="id",nullable = true)
        private CompanyEntity companyId;



        public AuthEntity() {
        }
    }

