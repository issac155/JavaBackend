package com.app.InvoiceJava.Dto;

import com.app.InvoiceJava.Entity.ItemTaxExemptionEntity;

import java.sql.Timestamp;

public class ItemTaxExemptionDto {
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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ItemTaxExemptionDto(ItemTaxExemptionEntity itemTaxExemptionEntity) {
        this.id = itemTaxExemptionEntity.getId();
        this.createdAt = itemTaxExemptionEntity.getCreatedAt();
        this.description = itemTaxExemptionEntity.getDescription();
        this.reason = itemTaxExemptionEntity.getReason();
        this.type = itemTaxExemptionEntity.getType();
        this.status = itemTaxExemptionEntity.getStatus();
    }
}
