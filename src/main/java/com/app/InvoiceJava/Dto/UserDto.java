package com.app.InvoiceJava.Dto;

public class UserDto {
}
package com.app.InvoiceJava.Dto;

import com.app.InvoiceJava.Entity.StockEntity;
import com.app.InvoiceJava.Entity.InterStateTaxEntity;
import com.app.InvoiceJava.Entity.IntraStateTaxEntity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.sql.Timestamp;
import java.time.LocalDate;

public class StockDto {

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

    // Tax details
    private TaxDetailDto interStateTax;
    private TaxDetailDto intraStateTax;

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

        // Set tax details
        if(stockEntity.getInterStateTaxRate() != null) {
            this.interStateTax = new TaxDetailDto(
                    stockEntity.getInterStateTaxRate().getId(),
                    stockEntity.getInterStateTaxRate().getTaxName(),
                    stockEntity.getInterStateTaxRate().getRate(),
                    stockEntity.getInterStateTaxRate().getTaxType()
            );
        }

        if(stockEntity.getIntraStateTaxRate() != null) {
            this.intraStateTax = new TaxDetailDto(
                    stockEntity.getIntraStateTaxRate().getId(),
                    stockEntity.getIntraStateTaxRate().getTaxName(),
                    stockEntity.getIntraStateTaxRate().getRate(),
                    stockEntity.getIntraStateTaxRate().getTaxType()
            );
        }
    }

    // Add getters and setters for the new tax fields
    public TaxDetailDto getInterStateTax() {
        return interStateTax;
    }

    public void setInterStateTax(TaxDetailDto interStateTax) {
        this.interStateTax = interStateTax;
    }

    public TaxDetailDto getIntraStateTax() {
        return intraStateTax;
    }

    public void setIntraStateTax(TaxDetailDto intraStateTax) {
        this.intraStateTax = intraStateTax;
    }

    // ... rest of your existing getters and setters
}

// Create a new DTO for tax details
class TaxDetailDto {
    private Long id;
    private String taxName;
    private Double rate;
    private String taxType;

    public TaxDetailDto(Long id, String taxName, Double rate, String taxType) {
        this.id = id;
        this.taxName = taxName;
        this.rate = rate;
        this.taxType = taxType;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTaxName() { return taxName; }
    public void setTaxName(String taxName) { this.taxName = taxName; }
    public Double getRate() { return rate; }
    public void setRate(Double rate) { this.rate = rate; }
    public String getTaxType() { return taxType; }
    public void setTaxType(String taxType) { this.taxType = taxType; }
}