package com.app.InvoiceJava.Repository;

import com.app.InvoiceJava.Entity.AuthEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepo extends JpaRepository<AuthEntity,Long> {
    boolean existsByEmail(String email);
}
