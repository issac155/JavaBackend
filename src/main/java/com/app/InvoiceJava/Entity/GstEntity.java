package com.app.InvoiceJava.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "gst")
public class GstEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String gstNumber;
    private String businessLegalName;
    private String businessTradeName;
    private LocalDate gstRegtDate;
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGstNumber() {
        return gstNumber;
    }

    public void setGstNumber(String gstNumber) {
        this.gstNumber = gstNumber;
    }

    public String getBusinessLegalName() {
        return businessLegalName;
    }

    public void setBusinessLegalName(String businessLegalName) {
        this.businessLegalName = businessLegalName;
    }

    public String getBusinessTradeName() {
        return businessTradeName;
    }

    public void setBusinessTradeName(String businessTradeName) {
        this.businessTradeName = businessTradeName;
    }

    public LocalDate getGstRegtDate() {
        return gstRegtDate;
    }

    public void setGstRegtDate(LocalDate gstRegtDate) {
        this.gstRegtDate = gstRegtDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public GstEntity(Long id, String gstNumber, String businessLegalName, String businessTradeName, LocalDate gstRegtDate, String status) {
        this.id = id;
        this.gstNumber = gstNumber;
        this.businessLegalName = businessLegalName;
        this.businessTradeName = businessTradeName;
        this.gstRegtDate = gstRegtDate;
        this.status = status;
    }

    @OneToOne
    @JoinColumn(name ="companyId",referencedColumnName = "id")
    private CompanyEntity companyEntity;

    public CompanyEntity getCompanyEntity() {
        return companyEntity;
    }

    public void setCompanyEntity(CompanyEntity company){
    this.companyEntity= company;
    }

}
