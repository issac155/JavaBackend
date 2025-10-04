package com.app.InvoiceJava.Controller;


import com.app.InvoiceJava.Dto.ResponseDto;
import com.app.InvoiceJava.Dto.StockDto;
import com.app.InvoiceJava.Entity.AuthEntity;
import com.app.InvoiceJava.Entity.StockEntity;
import com.app.InvoiceJava.Service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/")
public class StockController {

    @Autowired
    private StockService stockService;

    @PostMapping("/addStock")
    public ResponseEntity<ResponseDto<StockDto>>AddStock(@RequestPart("stock") StockEntity stock, Authentication authentication){
        AuthEntity currentUser =(AuthEntity) authentication.getPrincipal();
        ResponseDto<StockDto>response=stockService.addStock(stock,currentUser);
        return ResponseEntity.status(response.getStatus()).body(response);

    }




}
