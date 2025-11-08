package com.app.InvoiceJava.Dto;

import org.springframework.web.multipart.MultipartFile;

public class CompanyRequestDto {
    private String companyName;
    private String businessLocation;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private Long phoneNumber;
    private String currency;
    private String taxId;
    private boolean gstStatus;
    private String gstNumber;
    private String companyType;
    private MultipartFile companyLogo;

    // Getters and Setters
    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }

    public String getBusinessLocation() { return businessLocation; }
    public void setBusinessLocation(String businessLocation) { this.businessLocation = businessLocation; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public String getZipCode() { return zipCode; }
    public void setZipCode(String zipCode) { this.zipCode = zipCode; }

    public Long getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(Long phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }

    public String getTaxId() { return taxId; }
    public void setTaxId(String taxId) { this.taxId = taxId; }

    public boolean isGstStatus() { return gstStatus; }
    public void setGstStatus(boolean gstStatus) { this.gstStatus = gstStatus; }

    public String getGstNumber() { return gstNumber; }
    public void setGstNumber(String gstNumber) { this.gstNumber = gstNumber; }

    public String getCompanyType() { return companyType; }
    public void setCompanyType(String companyType) { this.companyType = companyType; }

    public MultipartFile getCompanyLogo() { return companyLogo; }
    public void setCompanyLogo(MultipartFile companyLogo) { this.companyLogo = companyLogo; }
}
