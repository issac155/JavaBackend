package com.app.InvoiceJava.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "gstTreatment")
public class GstTreatmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String gstTreatmentType;
    private String status;

}
