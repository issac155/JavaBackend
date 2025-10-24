package com.app.InvoiceJava.Controller;


import com.app.InvoiceJava.Dto.GstDto;
import com.app.InvoiceJava.Dto.ResponseDto;
import com.app.InvoiceJava.Entity.AuthEntity;
import com.app.InvoiceJava.Entity.GstEntity;
import com.app.InvoiceJava.Service.GstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/")
public class GstController {

    @Autowired
    private GstService gstService;

    @PostMapping("/creategst")
    public ResponseEntity<ResponseDto<GstDto>>CreateGst(@RequestPart("gst")GstEntity gst, Authentication authentication){
        AuthEntity currentUser =(AuthEntity) authentication.getPrincipal();
        ResponseDto<GstDto>response = gstService.createStock(gst,currentUser);
        return ResponseEntity.status(response.getStatus()).body(response);
    }


    @GetMapping("/getgst")
    public ResponseEntity<ResponseDto<GstDto>>GetGst(@RequestPart Authentication authentication){
        AuthEntity currentUser =(AuthEntity) authentication.getPrincipal();
        ResponseDto<GstDto>response = gstService.getGst(currentUser);
        return ResponseEntity.status(response.getStatus()).body(response);
    }



}
