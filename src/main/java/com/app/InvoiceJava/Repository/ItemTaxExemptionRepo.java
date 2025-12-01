package com.app.InvoiceJava.Repository;

import com.app.InvoiceJava.Entity.ItemTaxExemptionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemTaxExemptionRepo extends JpaRepository<ItemTaxExemptionEntity, Long> {
}
