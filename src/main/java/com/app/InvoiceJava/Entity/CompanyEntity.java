package com.app.InvoiceJava.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name ="company")
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String organizationId;
    private String companyName;
    private String businessLocation;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private Long phoneNumber;
    private String currency;
    private String status;
    private String createdAt;
    private String taxId;
    private boolean gstStatus;
    private String gstNumber;
    private String companyType;
    private String companyLogo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getBusinessLocation() {
        return businessLocation;
    }

    public void setBusinessLocation(String businessLocation) {
        this.businessLocation = businessLocation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public boolean isGstStatus() {
        return gstStatus;
    }

    public void setGstStatus(boolean gstStatus) {
        this.gstStatus = gstStatus;
    }

    public String getGstNumber() {
        return gstNumber;
    }

    public void setGstNumber(String gstNumber) {
        this.gstNumber = gstNumber;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
    }

    @OneToMany(mappedBy="companyId" ,cascade = CascadeType.ALL,orphanRemoval = true   )
    private List<AuthEntity> authEntities;

    public List<AuthEntity> getAuthEntities() {
        return authEntities;
    }

    public void setAuthEntities(List<AuthEntity> authEntities) {
        this.authEntities = authEntities;
    }


    public CompanyEntity(Long id, String organizationId, String companyName, String businessLocation, String address, String city, String state, String zipCode, String status, String currency, Long phoneNumber, String createdAt, String taxId, boolean gstStatus, String gstNumber, String companyLogo, String companyType) {
        this.id = id;
        this.organizationId = organizationId;
        this.companyName = companyName;
        this.businessLocation = businessLocation;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.status = status;
        this.currency = currency;
        this.phoneNumber = phoneNumber;
        this.createdAt = createdAt;
        this.taxId = taxId;
        this.gstStatus = gstStatus;
        this.gstNumber = gstNumber;
        this.companyLogo = companyLogo;
        this.companyType = companyType;
    }

    public CompanyEntity() {
    }
}
