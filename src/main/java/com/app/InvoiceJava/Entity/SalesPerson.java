package com.app.InvoiceJava.Entity;

import jakarta.persistence.*;

@Entity
@Table(name ="sales_person")
public class SalesPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;

    @ManyToOne()
}
