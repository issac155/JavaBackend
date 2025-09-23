package com.app.InvoiceJava.Entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.time.Instant;

@Entity
@Table(name = "inter_state_taxes")
public class InterStateTaxEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String taxName;
    private Double rate;
    private String taxType;
    private String status;
    private Timestamp createdAt;

    @PrePersist
    protected  void onCreate(){
        Timestamp now = Timestamp.from(Instant.now());
        this.createdAt = now;
    }


    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

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

    public InterStateTaxEntity(Long id, String taxName, Double rate, String taxType, String status, Timestamp createdAt) {
        this.id = id;
        this.taxName = taxName;
        this.rate = rate;
        this.taxType = taxType;
        this.status = status;
        this.createdAt = createdAt;
    }

    public InterStateTaxEntity() {
    }
}
