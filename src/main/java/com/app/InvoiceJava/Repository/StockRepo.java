package com.app.InvoiceJava.Repository;

import com.app.InvoiceJava.Entity.StockEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepo extends JpaRepository<StockEntity,Long> {
}
