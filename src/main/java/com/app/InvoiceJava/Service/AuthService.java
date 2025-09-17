package com.app.InvoiceJava.Service;

import com.app.InvoiceJava.Dto.AuthDto;
import com.app.InvoiceJava.Dto.ResponseDto;
import com.app.InvoiceJava.Entity.AuthEntity;
import com.app.InvoiceJava.Repository.AuthRepo;
import com.app.InvoiceJava.Utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private AuthRepo authRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtUtil jwtUtil;

    public ResponseDto<AuthDto> signup(AuthEntity auth) {
        try{
            if(auth.getEmail()==null ||auth.getEmail().trim().isEmpty()){
                return  ResponseDto.badRequest("email","Email cannot be empty");
            }
            if (auth.getName() == null || auth.getName().trim().isEmpty()) {
                return ResponseDto.badRequest("name", "Name cannot be empty");
            }
            if(auth.getPassword() ==null ||auth.getPassword().trim().isEmpty()){
                return ResponseDto.badRequest("password","Password cannot be empty");
            }
            if (auth.getPhoneNumber() == null) {
                return ResponseDto.badRequest("phonenumber", "Phone number cannot be empty");
            }
            if (auth.getAddress() == null || auth.getAddress().trim().isEmpty()) {
                return ResponseDto.badRequest("address","Address cannot be empty. ");
            }
            if (auth.getUserImage() == null || auth.getUserImage().trim().isEmpty()) {
                return ResponseDto.badRequest("userimage","User image cannot be empty. ");
            }
            if (auth.getUsertype() == null) {
                return ResponseDto.badRequest("usertype","User type cannot be empty. ");
            }
            if(authRepo.existsByEmail(auth.getEmail())){
                return ResponseDto.badRequest("Error",
                        "User with this email already exists"
                );
            }

                auth.setPassword(passwordEncoder.encode(auth.getPassword()));
                String token = jwtUtil.generateToken(auth.getEmail());
                auth.setToken(token);
                AuthEntity savedUser = authRepo.save(auth);
                AuthDto authDto = new AuthDto(savedUser);
                return ResponseDto.created("User created successfully", authDto);


        }catch (Exception e){
            return ResponseDto.internalServerError(
                    "User creation failed",
                    e.getMessage()
            );        }
    }


}
