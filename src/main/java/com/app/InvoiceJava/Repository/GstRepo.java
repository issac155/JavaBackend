package com.app.InvoiceJava.Repository;

import com.app.InvoiceJava.Entity.CompanyEntity;
import com.app.InvoiceJava.Entity.GstEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GstRepo extends JpaRepository<GstEntity,Long> {
 GstEntity findByCompanyEntity(CompanyEntity companyEntity);
}
