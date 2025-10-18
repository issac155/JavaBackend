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
        private CompanyEntity companyEntity;
    
        public AuthEntity getUserId() {
            return userId;
        }
    
        public void setUserId(AuthEntity userId) {
            this.userId = userId;
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

        public CompanyEntity getCompanyEntity() {
            return companyEntity;
        }

        public void setCompanyEntity(CompanyEntity companyEntity) {
            this.companyEntity = companyEntity;
        }

        public StockEntity(Long id, String itemType, String itemUnits, String itemName, Double itemQuantity, Double itemSellingPrice, LocalDate itemExpDate, String itemDescription, String itemHsnCode, String itemSacCode, String itemTaxPreference, String itemTaxExemption, String itemStatus, Timestamp createdAt, CompanyEntity companyEntity, AuthEntity userId, IntraStateTaxEntity intraStateTaxRate, InterStateTaxEntity interStateTaxRate) {
            this.id = id;
            this.itemType = itemType;
            this.itemUnits = itemUnits;
            this.itemName = itemName;
            this.itemQuantity = itemQuantity;
            this.itemSellingPrice = itemSellingPrice;
            this.itemExpDate = itemExpDate;
            this.itemDescription = itemDescription;
            this.itemHsnCode = itemHsnCode;
            this.itemSacCode = itemSacCode;
            this.itemTaxPreference = itemTaxPreference;
            this.itemTaxExemption = itemTaxExemption;
            this.itemStatus = itemStatus;
            this.createdAt = createdAt;
            this.companyEntity = companyEntity;
            this.userId = userId;
            this.intraStateTaxRate = intraStateTaxRate;
            this.interStateTaxRate = interStateTaxRate;
        }

        public StockEntity() {
        }
    }


