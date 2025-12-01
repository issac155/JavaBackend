package com.app.InvoiceJava.Controller;


import com.app.InvoiceJava.Dto.ItemTaxExemptionDto;
import com.app.InvoiceJava.Dto.ResponseDto;
import com.app.InvoiceJava.Dto.StockDto;
import com.app.InvoiceJava.Entity.AuthEntity;
import com.app.InvoiceJava.Entity.ItemTaxExemptionEntity;
import com.app.InvoiceJava.Service.ItemTaxExemptionService;
import org.springframework.security.core.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ItemTaxExemptionController {

    @Autowired
    private ItemTaxExemptionService itemTaxExemptionService;

    @PostMapping("/addtaxexm")
    public ResponseEntity<ResponseDto <ItemTaxExemptionDto>>AddItemTaxExemption(@RequestPart("itemTaxExemption")ItemTaxExemptionEntity itemTaxExemption, Authentication authentication) {
        AuthEntity currentUser =(AuthEntity) authentication.getPrincipal();
        ResponseDto<ItemTaxExemptionDto>response = itemTaxExemptionService.AddTaxExp(itemTaxExemption,currentUser);
        return ResponseEntity.status(response.getStatus()).body(response);
    }

}
