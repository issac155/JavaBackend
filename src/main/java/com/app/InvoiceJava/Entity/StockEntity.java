package com.app.InvoiceJava.Entity;


import jakarta.persistence.*;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "stock")
public class StockEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String itemType;
    private String itemName;
    private String itemUnits;
    private Double itemQuantity;
    private Double itemSellingPrice;
    private String itemDescription;
    private LocalDate itemExpDate;
    private String itemHsnCode;
    private String itemSacCode;
    private String itemTaxPreference;
    private String itemTaxExemption;
    private String itemStatus;
    private Timestamp createdAt;

    @PrePersist
    protected  void onCreate(){
        Timestamp now = Timestamp.from(Instant.now());
        this.createdAt = now;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="item_intra_state_tax_rate")
    private IntraStateTaxEntity intraStateTaxRate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_inter_state_tax_rate")
    private InterStateTaxEntity interStateTaxRate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private AuthEntity userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "companyId")
    private CompanyEntity companyId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemUnits() {
        return itemUnits;
    }

    public void setItemUnits(String itemUnits) {
        this.itemUnits = itemUnits;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getItemSellingPrice() {
        return itemSellingPrice;
    }

    public void setItemSellingPrice(Double itemSellingPrice) {
        this.itemSellingPrice = itemSellingPrice;
    }

    public Double getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(Double itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public LocalDate getItemExpDate() {
        return itemExpDate;
    }

    public void setItemExpDate(LocalDate itemExpDate) {
        this.itemExpDate = itemExpDate;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemHsnCode() {
        return itemHsnCode;
    }

    public void setItemHsnCode(String itemHsnCode) {
        this.itemHsnCode = itemHsnCode;
    }

    public String getItemTaxPreference() {
        return itemTaxPreference;
    }

    public void setItemTaxPreference(String itemTaxPreference) {
        this.itemTaxPreference = itemTaxPreference;
    }

    public String getItemTaxExemption() {
        return itemTaxExemption;
    }

    public void setItemTaxExemption(String itemTaxExemption) {
        this.itemTaxExemption = itemTaxExemption;
    }

    public String getItemSacCode() {
        return itemSacCode;
    }

    public void setItemSacCode(String itemSacCode) {
        this.itemSacCode = itemSacCode;
    }

    public String getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public IntraStateTaxEntity getIntraStateTaxRate() {
        return intraStateTaxRate;
    }

    public void setIntraStateTaxRate(IntraStateTaxEntity intraStateTaxRate) {
        this.intraStateTaxRate = intraStateTaxRate;
    }

    public InterStateTaxEntity getInterStateTaxRate() {
        return interStateTaxRate;
    }

    public void setInterStateTaxRate(InterStateTaxEntity interStateTaxRate) {
        this.interStateTaxRate = interStateTaxRate;
    }

    public StockEntity(Long id, String itemType, String itemName, Double itemSellingPrice, Double itemQuantity, String itemUnits, String itemDescription, String itemHsnCode, LocalDate itemExpDate, String itemSacCode, String itemTaxExemption, String itemTaxPreference, String itemStatus, Timestamp createdAt, IntraStateTaxEntity intraStateTaxRate, InterStateTaxEntity interStateTaxRate) {
        this.id = id;
        this.itemType = itemType;
        this.itemName = itemName;
        this.itemSellingPrice = itemSellingPrice;
        this.itemQuantity = itemQuantity;
        this.itemUnits = itemUnits;
        this.itemDescription = itemDescription;
        this.itemHsnCode = itemHsnCode;
        this.itemExpDate = itemExpDate;
        this.itemSacCode = itemSacCode;
        this.itemTaxExemption = itemTaxExemption;
        this.itemTaxPreference = itemTaxPreference;
        this.itemStatus = itemStatus;
        this.createdAt = createdAt;
        this.intraStateTaxRate = intraStateTaxRate;
        this.interStateTaxRate = interStateTaxRate;
    }
}
