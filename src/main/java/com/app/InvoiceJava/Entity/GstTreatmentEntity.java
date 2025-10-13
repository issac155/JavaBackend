package com.app.InvoiceJava.Entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.time.Instant;

@Entity
@Table(name = "gstTreatment")
public class GstTreatmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String gstTreatmentType;
    private String status;
    private Timestamp createdAt;


    @PrePersist
    protected void onCreate(){
        Timestamp now = Timestamp.from(Instant.now());
        this.createdAt = now;
    }

}
