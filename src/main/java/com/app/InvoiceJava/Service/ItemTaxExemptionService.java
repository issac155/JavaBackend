package com.app.InvoiceJava.Service;


import com.app.InvoiceJava.Dto.ItemTaxExemptionDto;
import com.app.InvoiceJava.Dto.ResponseDto;
import com.app.InvoiceJava.Entity.AuthEntity;
import com.app.InvoiceJava.Entity.ItemTaxExemptionEntity;
import com.app.InvoiceJava.Repository.AuthRepo;
import com.app.InvoiceJava.Repository.ItemTaxExemptionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemTaxExemptionService {

    @Autowired
    private ItemTaxExemptionRepo itemTaxExemptionRepo;

    @Autowired
    private AuthRepo authRepo;

    public ResponseDto<ItemTaxExemptionDto> AddTaxExp(ItemTaxExemptionEntity itemTaxExemption, AuthEntity currentUser) {
        try {
            Long companyId = authRepo.findCompanyIdByUserId(currentUser.getId());
            itemTaxExemption.setStatus("0");
            itemTaxExemption


        }catch (){

        }
    }
}
