package com.app.InvoiceJava.Repository;

import com.app.InvoiceJava.Entity.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepo extends JpaRepository<CompanyEntity,Long> {
    boolean existsByOrganizationId(String organizationId);

}
