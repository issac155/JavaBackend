package com.app.InvoiceJava.Service;

import com.app.InvoiceJava.Dto.ResponseDto;
import com.app.InvoiceJava.Dto.StockDto;
import com.app.InvoiceJava.Entity.AuthEntity;
import com.app.InvoiceJava.Entity.StockEntity;
import com.app.InvoiceJava.Repository.AuthRepo;
import com.app.InvoiceJava.Repository.StockRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService {

    @Autowired
    private StockRepo stockRepo;

    @Autowired
    private AuthRepo authRepo;

    public ResponseDto<StockDto> addStock(StockEntity stock, AuthEntity currentUser) {
        try {
            Long companyId = authRepo.findCompanyIdByUserId(currentUser.getId());

            stock.setItemStatus("0");
            stock.setUserId(currentUser);
            StockEntity saved = stockRepo.save(stock);

            return ResponseDto.created("Stock created sucessfully",saved);
        } catch (Exception e) {
            return ResponseDto.internalServerError("stock created", e.getMessage());
        }
    }
}