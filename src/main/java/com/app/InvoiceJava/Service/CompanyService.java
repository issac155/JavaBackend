package com.app.InvoiceJava.Service;

import com.app.InvoiceJava.Dto.AuthDto;
import com.app.InvoiceJava.Dto.CompanyDto;
import com.app.InvoiceJava.Dto.CompanyRequestDto;
import com.app.InvoiceJava.Dto.ResponseDto;
import com.app.InvoiceJava.Entity.AuthEntity;
import com.app.InvoiceJava.Entity.CompanyEntity;
import com.app.InvoiceJava.Repository.AuthRepo;
import com.app.InvoiceJava.Repository.CompanyRepo;
import com.app.InvoiceJava.Utils.IdGeneratorUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepo companyRepo;
    @Autowired
    private AuthRepo authRepo;


    public ResponseDto<CompanyDto> CreateCompany(CompanyRequestDto request, AuthEntity currentUser) {
        try{
            CompanyEntity company = new CompanyEntity();

            company.setCompanyName(request.getCompanyName());
            company.setBusinessLocation(request.getBusinessLocation());
            company.setAddress(request.getAddress());
            company.setCity(request.getCity());
            company.setState(request.getState());
            company.setZipCode(request.getZipCode());
            company.setPhoneNumber(request.getPhoneNumber());
            company.setCurrency(request.getCurrency());
            company.setTaxId(request.getTaxId());
            company.setGstStatus(request.isGstStatus());
            company.setGstNumber(request.getGstNumber());
            company.setCompanyType(request.getCompanyType());

            String orgId;
            do{
                orgId = IdGeneratorUtil.generateOrganizationId();
            }while (companyRepo.existsByOrganizationId(orgId));
            company.setOrganizationId(orgId);
            company.setStatus("0");
            if(request.getCompanyLogo() != null && !request.getCompanyLogo().isEmpty()){
             MultipartFile companyLogo = request.getCompanyLogo();

                String fileName = System.currentTimeMillis()+"_"+companyLogo.getOriginalFilename();
                String uploadDir="uploads/company-logos/";
                Path uploadpath = Paths.get(uploadDir);
                if(!Files.exists(uploadpath)){
                    Files.createDirectories((uploadpath));
                }

                Path filePath = uploadpath.resolve(fileName);
                Files.copy(companyLogo.getInputStream(),filePath, StandardCopyOption.REPLACE_EXISTING);
                company.setCompanyLogo(fileName);
            }

           CompanyEntity saved = companyRepo.save(company);
            currentUser.setCompanyId(company);
            authRepo.save(currentUser);
            CompanyDto companyDto = new CompanyDto(saved);
            return ResponseDto.created("Company created successfully", companyDto);

        }catch(Exception e){
            return ResponseDto.internalServerError("company Created",e.getMessage());
        }


    }
}


