package com.app.InvoiceJava.Entity;


import jakarta.persistence.*;

import java.sql.Timestamp;
import java.time.Instant;

@Entity
@Table(name="customer")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String custType;
    private String custName;
    private String custDisplayName;
    private String custCompanyName;
    private Long custPhone;
    private String custEmail;
    private String custOtherContact;
    @Column(columnDefinition = "TEXT")
    private String custBillingAddress;
    private String custBillingCity;
    private String custBillingState;
    private String custBillingZipcode;
    @Column(columnDefinition = "TEXT")
    private String custShippingAddress;
    private String custShippingCity;
    private String custShippingState;
    private String custShippingZipcode;
    private String custGstNum;
    private String custBusinessLegalName;
    private String custBusinessTradeName;
    private String custTaxPref;
    private String custExemptionReason;
    private Timestamp createdAt;
    private String status;


    @PrePersist
    protected void onCreate(){
        Timestamp now = Timestamp.from(Instant.now());
        this.createdAt = now;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public String getCustExemptionReason() {
        return custExemptionReason;
    }

    public void setCustExemptionReason(String custExemptionReason) {
        this.custExemptionReason = custExemptionReason;
    }

    public String getCustTaxPref() {
        return custTaxPref;
    }

    public void setCustTaxPref(String custTaxPref) {
        this.custTaxPref = custTaxPref;
    }

    public String getCustBusinessTradeName() {
        return custBusinessTradeName;
    }

    public void setCustBusinessTradeName(String custBusinessTradeName) {
        this.custBusinessTradeName = custBusinessTradeName;
    }

    public String getCustBusinessLegalName() {
        return custBusinessLegalName;
    }

    public void setCustBusinessLegalName(String custBusinessLegalName) {
        this.custBusinessLegalName = custBusinessLegalName;
    }

    public String getCustGstNum() {
        return custGstNum;
    }

    public void setCustGstNum(String custGstNum) {
        this.custGstNum = custGstNum;
    }

    public String getCustShippingZipcode() {
        return custShippingZipcode;
    }

    public void setCustShippingZipcode(String custShippingZipcode) {
        this.custShippingZipcode = custShippingZipcode;
    }

    public String getCustShippingCity() {
        return custShippingCity;
    }

    public void setCustShippingCity(String custShippingCity) {
        this.custShippingCity = custShippingCity;
    }

    public String getCustShippingState() {
        return custShippingState;
    }

    public void setCustShippingState(String custShippingState) {
        this.custShippingState = custShippingState;
    }

    public String getCustShippingAddress() {
        return custShippingAddress;
    }

    public void setCustShippingAddress(String custShippingAddress) {
        this.custShippingAddress = custShippingAddress;
    }

    public String getCustBillingZipcode() {
        return custBillingZipcode;
    }

    public void setCustBillingZipcode(String custBillingZipcode) {
        this.custBillingZipcode = custBillingZipcode;
    }

    public Long getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(Long custPhone) {
        this.custPhone = custPhone;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }

    public String getCustCompanyName() {
        return custCompanyName;
    }

    public void setCustCompanyName(String custCompanyName) {
        this.custCompanyName = custCompanyName;
    }

    public String getCustDisplayName() {
        return custDisplayName;
    }

    public void setCustDisplayName(String custDisplayName) {
        this.custDisplayName = custDisplayName;
    }

    public String getCustOtherContact() {
        return custOtherContact;
    }

    public void setCustOtherContact(String custOtherContact) {
        this.custOtherContact = custOtherContact;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public String getCustBillingAddress() {
        return custBillingAddress;
    }

    public void setCustBillingAddress(String custBillingAddress) {
        this.custBillingAddress = custBillingAddress;
    }

    public String getCustBillingCity() {
        return custBillingCity;
    }

    public void setCustBillingCity(String custBillingCity) {
        this.custBillingCity = custBillingCity;
    }

    public String getCustBillingState() {
        return custBillingState;
    }

    public void setCustBillingState(String custBillingState) {
        this.custBillingState = custBillingState;
    }
}

