package com.app.InvoiceJava.Controller;
import com.app.InvoiceJava.Dto.CompanyDto;
import com.app.InvoiceJava.Dto.ResponseDto;
import com.app.InvoiceJava.Entity.AuthEntity;
import com.app.InvoiceJava.Entity.CompanyEntity;
import com.app.InvoiceJava.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("api/")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping(value = "createcompany",consumes = {"multipart/form-data"})
    public ResponseEntity<ResponseDto<CompanyDto>>CreateCompany(@RequestPart("company")CompanyEntity company, @RequestPart(value = "companyLogo",required = false)MultipartFile companyLogo, Authentication authentication){
        AuthEntity currentUser = (AuthEntity) authentication.getPrincipal();
        ResponseDto<CompanyDto>response = companyService.CreateCompany(company,companyLogo,currentUser);
        return ResponseEntity.status(response.getStatus()).body(response);
    }

}
