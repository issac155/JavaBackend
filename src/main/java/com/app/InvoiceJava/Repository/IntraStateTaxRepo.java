package com.app.InvoiceJava.Repository;

import com.app.InvoiceJava.Entity.InterStateTaxEntity;
import com.app.InvoiceJava.Entity.IntraStateTaxEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IntraStateTaxRepo extends JpaRepository<IntraStateTaxEntity,Long> {

}
