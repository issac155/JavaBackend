package com.app.InvoiceJava.Dto;

import com.app.InvoiceJava.Entity.StockEntity;

import java.sql.Timestamp;
import java.time.LocalDate;

public class StockDto {

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
    private TaxDetailsDto interStateTax;
    private TaxDetailsDto intraStateTax;


    public TaxDetailsDto getIntraStateTax() {
        return intraStateTax;
    }

    public void setIntraStateTax(TaxDetailsDto intraStateTax) {
        this.intraStateTax = intraStateTax;
    }

    public TaxDetailsDto getInterStateTax() {
        return interStateTax;
    }

    public void setInterStateTax(TaxDetailsDto interStateTax) {
        this.interStateTax = interStateTax;
    }

    public StockDto(StockEntity stockEntity) {
        this.id = stockEntity.getId();
        this.itemType = stockEntity.getItemType();
        this.itemName = stockEntity.getItemName();
        this.itemUnits = stockEntity.getItemUnits();
        this.itemSellingPrice = stockEntity.getItemSellingPrice();
        this.itemQuantity = stockEntity.getItemQuantity();
        this.itemTaxExemption = stockEntity.getItemTaxExemption();
        this.itemDescription = stockEntity.getItemDescription();
        this.itemHsnCode = stockEntity.getItemHsnCode();
        this.itemTaxPreference = stockEntity.getItemTaxPreference();
        this.itemExpDate = stockEntity.getItemExpDate();
        this.itemSacCode = stockEntity.getItemSacCode();
        this.itemStatus = stockEntity.getItemStatus();
        this.createdAt = stockEntity.getCreatedAt();

        if(stockEntity.getInterStateTaxRate() !=null){
            this.interStateTax = new TaxDetailsDto(
                    stockEntity.getInterStateTaxRate().getId(),
                    stockEntity.getInterStateTaxRate().getTaxName(),
                    stockEntity.getInterStateTaxRate().getRate(),
                    stockEntity.getInterStateTaxRate().getTaxType()
            );
        }
    }

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

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemUnits() {
        return itemUnits;
    }

    public void setItemUnits(String itemUnits) {
        this.itemUnits = itemUnits;
    }

    public Double getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(Double itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public Double getItemSellingPrice() {
        return itemSellingPrice;
    }

    public void setItemSellingPrice(Double itemSellingPrice) {
        this.itemSellingPrice = itemSellingPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public LocalDate getItemExpDate() {
        return itemExpDate;
    }

    public void setItemExpDate(LocalDate itemExpDate) {
        this.itemExpDate = itemExpDate;
    }

    public String getItemHsnCode() {
        return itemHsnCode;
    }

    public void setItemHsnCode(String itemHsnCode) {
        this.itemHsnCode = itemHsnCode;
    }

    public String getItemSacCode() {
        return itemSacCode;
    }

    public void setItemSacCode(String itemSacCode) {
        this.itemSacCode = itemSacCode;
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
}
