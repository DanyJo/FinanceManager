package com.fmi.pfmapp.exception;

public class InsufficientFunds extends RuntimeException {
    public InsufficientFunds(String message) {
        super(message);
    }

    public InsufficientFunds(String message, Throwable cause) {
        super(message, cause);
    }
}
