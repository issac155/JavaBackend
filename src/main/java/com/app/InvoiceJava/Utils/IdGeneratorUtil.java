package com.app.InvoiceJava.Utils;

import java.util.UUID;

public class IdGeneratorUtil {
    private IdGeneratorUtil(){

    }

    public static String generateOrganizationId(){
        return "ORG-"+UUID.randomUUID().toString().substring(0,8).toUpperCase();

    }
}
