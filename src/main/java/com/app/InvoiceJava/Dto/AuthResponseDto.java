package com.app.InvoiceJava.Dto;

public class AuthResponseDto {
    private AuthDto auth;
    private CompanyDto company;

    public AuthDto getAuth() {
        return auth;
    }

    public void setAuth(AuthDto auth) {
        this.auth = auth;
    }

    public CompanyDto getCompany() {
        return company;
    }

    public void setCompany(CompanyDto company) {
        this.company = company;
    }

    public AuthResponseDto(AuthDto auth, CompanyDto company) {
        this.auth = auth;
        this.company = company;
    }
}
