package com.app.InvoiceJava.Dto;

import com.app.InvoiceJava.Entity.GstEntity;

import java.time.LocalDate;

public class GstDto {
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public GstDto(GstEntity gstEntity) {
        this.id = gstEntity.getId();
        this.status = gstEntity.getStatus();
        this.gstRegtDate = gstEntity.getGstRegtDate();
        this.businessLegalName = gstEntity.getBusinessLegalName();
        this.gstNumber = gstEntity.getGstNumber();
        this.businessTradeName = gstEntity.getBusinessTradeName();
    }
}
