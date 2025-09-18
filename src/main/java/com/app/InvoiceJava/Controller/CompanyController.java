package com.app.InvoiceJava.Controller;
import com.app.InvoiceJava.Dto.CompanyDto;
import com.app.InvoiceJava.Dto.ResponseDto;
import com.app.InvoiceJava.Entity.AuthEntity;
import com.app.InvoiceJava.Entity.CompanyEntity;
import com.app.InvoiceJava.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping("create")
    public ResponseEntity<ResponseDto<CompanyDto>>CreateCompany(@RequestBody CompanyEntity company, Authentication authentication){
        AuthEntity currentUser = (AuthEntity) authentication.getPrincipal();
        ResponseDto<CompanyDto>response = companyService.CreateCompany(company,currentUser);
        return ResponseEntity.status(response.getStatus()).body(response);
    }

}
