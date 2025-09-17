package com.app.InvoiceJava.Dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.http.HttpStatus;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseDto <T>{
    private String message;
    private String error;
    private int status;
    private T data;

    public ResponseDto(String message, int status, T data) {
        this.message = message;
        this.status = status;
        this.data = data;
    }

    public ResponseDto(String message, String error, int status) {
        this.message = message;
        this.error = error;
        this.status = status;
    }


    public ResponseDto(String error, int status) {
        this.error = error;
        this.status = status;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T>ResponseDto<T>success(String message ,T data){
        return new ResponseDto<T>(message, HttpStatus.OK.value(),data);
    }

    public static<T>ResponseDto<T>created(String message,T data){
        return new ResponseDto<T>(message,HttpStatus.CREATED.value(),data);
    }

    public static <T> ResponseDto<T> badRequest(String message, String error) {
        return new ResponseDto<>(message, error, HttpStatus.BAD_REQUEST.value());
    }

    public static <T> ResponseDto<T> unauthorized(String error) {
        return new ResponseDto<>(error, HttpStatus.UNAUTHORIZED.value());
    }

    public static <T> ResponseDto<T> notFound(String error) {
        return new ResponseDto<>(error, HttpStatus.NOT_FOUND.value());
    }

    public static <T> ResponseDto<T> internalServerError(String message, String error) {
        return new ResponseDto<>(message, error, HttpStatus.INTERNAL_SERVER_ERROR.value());
    }

}
