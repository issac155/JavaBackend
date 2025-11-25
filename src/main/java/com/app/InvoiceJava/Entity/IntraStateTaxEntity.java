package com.app.InvoiceJava.Entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.time.Instant;

@Entity
@Table(name = "intra_state_taxes")
public class IntraStateTaxEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String taxName;
    private Double rate;
    private String taxType;
    private String status;
    private Timestamp createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaxName() {
        return taxName;
    }

    public void setTaxName(String taxName) {
        this.taxName = taxName;
    }

    public String getTaxType() {
        return taxType;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
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

    @PrePersist
    protected  void onCreate(){
        Timestamp now = Timestamp.from(Instant.now());
        this.createdAt = now;
    }

    public CompanyEntity getCompanyEntity() {
        return companyEntity;
    }

    public void setCompanyEntity(CompanyEntity companyEntity) {
        this.companyEntity = companyEntity;
    }

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "companyId")
    private CompanyEntity companyEntity;

    public IntraStateTaxEntity(Long id, Timestamp createdAt, String status, String taxType, Double rate, String taxName) {
        this.id = id;
        this.createdAt = createdAt;
        this.status = status;
        this.taxType = taxType;
        this.rate = rate;
        this.taxName = taxName;
    }

    public IntraStateTaxEntity() {
    }
}
