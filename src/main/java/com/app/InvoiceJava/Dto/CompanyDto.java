package com.app.InvoiceJava.Dto;

import com.app.InvoiceJava.Config.AppConfig;
import com.app.InvoiceJava.Entity.CompanyEntity;
import java.sql.Timestamp;

public class CompanyDto {

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
    private Timestamp createdAt;
    private String taxId;
    private boolean gstStatus;
    private String gstNumber;
    private String companyType;
    private String companyLogo;

    public CompanyDto(CompanyEntity companyEntity) {
        this.companyName = companyEntity.getCompanyName();
        this.id = companyEntity.getId();
        this.organizationId = companyEntity.getOrganizationId();
        this.businessLocation = companyEntity.getBusinessLocation();
        this.state =companyEntity.getState();
        this.address =companyEntity.getAddress();
        this.city = companyEntity.getCity();
        this.zipCode = companyEntity.getZipCode();
        this.phoneNumber = companyEntity.getPhoneNumber();
        this.currency = companyEntity.getCurrency();
        this.taxId = companyEntity.getTaxId();
        this.createdAt =companyEntity.getCreatedAt();
        this.status = companyEntity.getStatus();
        this.gstStatus =companyEntity.isGstStatus();
        this.gstNumber = companyEntity.getGstNumber();
        this.companyType =companyEntity.getCompanyType();
        if (companyEntity.getCompanyLogo() != null && !companyEntity.getCompanyLogo().isEmpty()) {
            this.companyLogo = AppConfig.getBaseUrl() + "/uploads/company-logos/" + companyEntity.getCompanyLogo();
        } else {
            this.companyLogo = null;
        }

    }
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBusinessLocation() {
        return businessLocation;
    }

    public void setBusinessLocation(String businessLocation) {
        this.businessLocation = businessLocation;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
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
}
