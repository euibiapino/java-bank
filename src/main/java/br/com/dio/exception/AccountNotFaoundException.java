package br.com.dio.exception;

public class AccountNotFaoundException extends RuntimeException {

    public AccountNotFaoundException(String message) {
        super(message);
    }

}
