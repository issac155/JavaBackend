package com.app.InvoiceJava.Service;

import com.app.InvoiceJava.Dto.AuthDto;
import com.app.InvoiceJava.Dto.CompanyDto;
import com.app.InvoiceJava.Dto.ResponseDto;
import com.app.InvoiceJava.Entity.AuthEntity;
import com.app.InvoiceJava.Entity.CompanyEntity;
import com.app.InvoiceJava.Repository.AuthRepo;
import com.app.InvoiceJava.Repository.CompanyRepo;
import com.app.InvoiceJava.Utils.IdGeneratorUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepo companyRepo;
    @Autowired
    private AuthRepo authRepo;


    public ResponseDto<CompanyDto> CreateCompany(CompanyEntity company, AuthEntity currentUser) {
        try{

            String orgId;
            do{
                orgId = IdGeneratorUtil.generateOrganizationId();
            }while (companyRepo.existsByOrganizationId(orgId));
            company.setOrganizationId(orgId);
           CompanyEntity saved = companyRepo.save(company);
            currentUser.setCompanyId(company);
            authRepo.save(currentUser);
            CompanyDto companyDto = new CompanyDto(saved);
            return ResponseDto.created("User created successfully", companyDto);

        }catch(Exception e){
            return ResponseDto.internalServerError("company Created",e.getMessage());
        }


    }
}
