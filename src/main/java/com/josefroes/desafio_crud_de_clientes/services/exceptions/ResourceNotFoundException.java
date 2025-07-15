package com.josefroes.desafio_crud_de_clientes.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String mensage) {
        super(mensage);
    }
}
