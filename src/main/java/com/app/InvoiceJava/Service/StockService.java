package com.app.InvoiceJava.Service;

import com.app.InvoiceJava.Dto.ResponseDto;
import com.app.InvoiceJava.Dto.StockDto;
import com.app.InvoiceJava.Entity.AuthEntity;
import com.app.InvoiceJava.Entity.StockEntity;
import com.app.InvoiceJava.Repository.StockRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService {

    @Autowired
    private StockRepo stockRepo;

    public ResponseDto<StockDto> addStock(StockEntity stock, AuthEntity currentUser) {
   try{
       stock.setItemStatus("0");
       StockEntity saved = stockRepo.save(stock);


   }catch(Exception e){

   }
    }
}
