package com.app.InvoiceJava.Service;

import com.app.InvoiceJava.Dto.GstDto;
import com.app.InvoiceJava.Dto.ResponseDto;
import com.app.InvoiceJava.Entity.AuthEntity;
import com.app.InvoiceJava.Entity.GstEntity;
import com.app.InvoiceJava.Repository.GstRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;


public class GstService {
    @Autowired
    private GstRepo gstRepo;

    public ResponseDto<GstDto> createStock(GstEntity gst, AuthEntity currentUser) {
        try {
            gst.setStatus("0");
            if(currentUser.getCompanyId()!= null){
                gst.setCompanyEntity(currentUser.getCompanyId());
            }
            GstEntity saved = gstRepo.save(gst);
            GstDto gstDto = new GstDto(saved);
            return  ResponseDto.created("Gst Created Sucessfully",gstDto);
        }catch (Exception e){
        return ResponseDto.internalServerError("Error Gst Creatation",e.getMessage());
        }
    }

    public ResponseDto<GstDto> getGst(AuthEntity currentUser) {

        try{
            Optional<GstEntity>gstDetails = gstRepo.

        }catch (Exception e){

        }
    }
}
