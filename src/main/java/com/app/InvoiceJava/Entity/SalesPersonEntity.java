package com.app.InvoiceJava.Entity;

import jakarta.persistence.*;

@Entity
@Table(name ="sales_person")
public class  SalesPersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CompanyEntity getCompanyEntity() {
        return companyEntity;
    }

    public void setCompanyEntity(CompanyEntity companyEntity) {
        this.companyEntity = companyEntity;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public SalesPersonEntity(Long id, CompanyEntity companyEntity, String phone, String email, String name) {
        this.id = id;
        this.companyEntity = companyEntity;
        this.phone = phone;
        this.email = email;
        this.name = name;
    }

    public SalesPersonEntity() {
    }

    @ManyToOne
    @JoinColumn(name = "company",referencedColumnName = "id")
    private CompanyEntity companyEntity;
}
