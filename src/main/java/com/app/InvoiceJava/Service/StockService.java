package com.app.InvoiceJava.Service;

import com.app.InvoiceJava.Dto.ResponseDto;
import com.app.InvoiceJava.Dto.StockDto;
import com.app.InvoiceJava.Entity.AuthEntity;
import com.app.InvoiceJava.Entity.InterStateTaxEntity;
import com.app.InvoiceJava.Entity.IntraStateTaxEntity;
import com.app.InvoiceJava.Entity.StockEntity;
import com.app.InvoiceJava.Repository.AuthRepo;
import com.app.InvoiceJava.Repository.InterStateTaxRepo;
import com.app.InvoiceJava.Repository.IntraStateTaxRepo;
import com.app.InvoiceJava.Repository.StockRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StockService {

    @Autowired
    private StockRepo stockRepo;

    @Autowired
    private AuthRepo authRepo;

    @Autowired
    private InterStateTaxRepo interStateTaxRepo;

    @Autowired
    private IntraStateTaxRepo intraStateTaxRepo;

    public ResponseDto<StockDto> addStock(StockEntity stock, AuthEntity currentUser) {
        try {
            Long companyId = authRepo.findCompanyIdByUserId(currentUser.getId());

            stock.setItemStatus("0");
            stock.setUserId(currentUser);

            if(currentUser.getCompanyId() !=null){
                stock.setCompanyEntity(currentUser.getCompanyId());
            }

            if("Taxable".equalsIgnoreCase(stock.getItemTaxPreference())){
                if(stock.getInterStateTaxRate() != null && stock.getInterStateTaxRate().getId()!=null){
                    Optional<InterStateTaxEntity>interTaxOpt = interStateTaxRepo.findById(stock.getInterStateTaxRate().getId());
                        if(interTaxOpt.isPresent()){
                            stock.setInterStateTaxRate(interTaxOpt.get());
                        }else{
                            return ResponseDto.notFound("Invalid Tax");

                        }
                }else{
                    stock.setInterStateTaxRate(null);

                }

                if(stock.getIntraStateTaxRate() != null && stock.getIntraStateTaxRate().getId()!=null){
                    Optional<IntraStateTaxEntity>intraTaxOpt = intraStateTaxRepo.findById(stock.getInterStateTaxRate().getId());
                    if(intraTaxOpt.isPresent()){
                        stock.setIntraStateTaxRate(intraTaxOpt.get());
                    }else{
                        return ResponseDto.notFound("Invalid Tax");

                    }

                }
            }else{
                stock.setInterStateTaxRate(null);
                stock.setIntraStateTaxRate(null);
            }


            StockEntity saved = stockRepo.save(stock);
            StockDto stockDto = new StockDto(saved);
            return ResponseDto.created("Stock created successfully", stockDto);
        } catch (Exception e) {
            return ResponseDto.internalServerError("stock created", e.getMessage());
        }
    }
}