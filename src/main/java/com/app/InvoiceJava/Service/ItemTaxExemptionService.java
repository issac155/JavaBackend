package com.app.InvoiceJava.Service;


import com.app.InvoiceJava.Dto.ItemTaxExemptionDto;
import com.app.InvoiceJava.Dto.ResponseDto;
import com.app.InvoiceJava.Entity.AuthEntity;
import com.app.InvoiceJava.Entity.CompanyEntity;
import com.app.InvoiceJava.Entity.ItemTaxExemptionEntity;
import com.app.InvoiceJava.Repository.AuthRepo;
import com.app.InvoiceJava.Repository.CompanyRepo;
import com.app.InvoiceJava.Repository.ItemTaxExemptionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemTaxExemptionService {

    @Autowired
    private ItemTaxExemptionRepo itemTaxExemptionRepo;

    @Autowired
    private AuthRepo authRepo;

    @Autowired
    private CompanyRepo companyRepo;

    @Autowired
    private ItemTaxExemptionRepo itemTaxExemptionrepo;

    public ResponseDto<ItemTaxExemptionDto> AddTaxExp(ItemTaxExemptionEntity itemTaxExemption, AuthEntity currentUser) {
        try {
//            Long companyId = authRepo.findCompanyIdByUserId(currentUser.getId());
//            CompanyEntity company = companyRepo.findById(companyId);
            if(currentUser.getCompanyId()!= null){
                itemTaxExemption.setCompanyEntity(currentUser.getCompanyId());
            }
            itemTaxExemption.setStatus("0");
//            itemTaxExemption.setCompanyEntity(company);
            ItemTaxExemptionEntity saved = itemTaxExemptionrepo.save(itemTaxExemption);
            ItemTaxExemptionDto  itemTaxExemptionDto = new ItemTaxExemptionDto(saved);
            return ResponseDto.created("Item Tax Exemption Successfully",itemTaxExemptionDto);




        }catch (Exception e){
            return ResponseDto.internalServerError("Error Tax Excemption Creation",e.getMessage());

        }
    }
}
