package com.app.InvoiceJava.Config;

import com.app.InvoiceJava.Entity.AuthEntity;
import com.app.InvoiceJava.Repository.AuthRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class AdminInitializer implements CommandLineRunner {

    @Autowired
    private AuthRepo authRepo;

   @Autowired
   private PasswordEncoder passwordEncoder;


    @Override
    public void run(String ...  args){
        String adminEmail = "admin@gmail.com";

        if(authRepo.findByEmail(adminEmail).isEmpty()){
            AuthEntity admin = new  AuthEntity();
            admin.setName("System Admin");
            admin.setEmail(adminEmail);
            admin.setPassword(passwordEncoder.encode("Admin@123")); // default password
            admin.setPhoneNumber(9876543210L);
            admin.setAddress("Head Office");
            admin.setUsertype(AuthEntity.UserType.ADMIN);
            admin.setEmailStatus("VERIFIED");
            admin.setEmailVerifiedAt("System Setup");
            authRepo.save(admin);
            System.out.println("✅ Default admin user created successfully!");
            System.out.println("   Email: " + adminEmail);
            System.out.println("   Password: Admin@123");

        }else{
            System.out.println("ℹ️ Admin user already exists. Skipping creation.");

        }
    }
}
