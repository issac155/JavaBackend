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
    private String industry;
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

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
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

    @OneToMany(mappedBy="companyId" ,cascade = CascadeType.ALL,orphanRemoval = true   )
    private List<AuthEntity> authEntities;

    public List<AuthEntity> getAuthEntities() {
        return authEntities;
    }

    public void setAuthEntities(List<AuthEntity> authEntities) {
        this.authEntities = authEntities;
    }

    public CompanyEntity(Long id, String organizationId, String companyName, String industry, String address, String businessLocation, String city, String state, String zipCode, Long phoneNumber, String currency, String createdAt, String status, String taxId, List<AuthEntity> authEntities) {
        this.id = id;
        this.organizationId = organizationId;
        this.companyName = companyName;
        this.industry = industry;
        this.address = address;
        this.businessLocation = businessLocation;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.currency = currency;
        this.createdAt = createdAt;
        this.status = status;
        this.taxId = taxId;
        this.authEntities = authEntities;
    }

    public CompanyEntity() {
    }
}
