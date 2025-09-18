package com.app.InvoiceJava.Repository;

import com.app.InvoiceJava.Entity.AuthEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthRepo extends JpaRepository<AuthEntity,Long> {
    boolean existsByEmail(String email);
    Optional<AuthEntity> findByEmail(String email);
}
