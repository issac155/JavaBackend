package com.app.InvoiceJava.Entity;


import jakarta.persistence.*;

import java.sql.Timestamp;
import java.time.Instant;

@Entity
@Table(name = "item_tax_exemption")
public class ItemTaxExemptionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String reason;
    private String description;
    private String type;
    private String status;
    private Timestamp createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public ItemTaxExemptionEntity() {
    }

    public ItemTaxExemptionEntity(Long id, String reason, String description, Timestamp createdAt, String type, String status) {
        this.id = id;
        this.reason = reason;
        this.description = description;
        this.createdAt = createdAt;
        this.type = type;
        this.status = status;
    }

    @PrePersist
    protected void onCreate() {
        Timestamp now = Timestamp.from(Instant.now() );
        this.createdAt = now;



    }
}
