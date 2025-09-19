package com.app.InvoiceJava.Controller;

import com.app.InvoiceJava.Dto.AuthDto;
import com.app.InvoiceJava.Dto.AuthResponseDto;
import com.app.InvoiceJava.Dto.ResponseDto;
import com.app.InvoiceJava.Entity.AuthEntity;
import com.app.InvoiceJava.Service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<ResponseDto<AuthDto>> signup(@RequestBody AuthEntity auth) {
        ResponseDto<AuthDto>response = authService.signup(auth);
        return ResponseEntity.status(response.getStatus()).body(response);
    }

    @PostMapping("/signin")
    public ResponseEntity<ResponseDto<AuthResponseDto>>signin(@RequestBody AuthEntity auth){
        ResponseDto<AuthResponseDto>response = authService.signin(auth);
        return ResponseEntity.status(response.getStatus()).body(response);
    }
}
