package com.app.InvoiceJava.Dto;

public class TaxDetailsDto {

    private Long id;
    private String taxName;
    private Double rate;
    private String taxType;

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

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public String getTaxType() {
        return taxType;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    public TaxDetailsDto(Long id, String taxName, Double rate, String taxType) {
        this.id = id;
        this.taxName = taxName;
        this.rate = rate;
        this.taxType = taxType;
    }
}
