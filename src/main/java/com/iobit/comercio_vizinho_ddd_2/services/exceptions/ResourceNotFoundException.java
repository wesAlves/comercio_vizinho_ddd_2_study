package com.iobit.comercio_vizinho_ddd_2.services.exceptions;

import java.io.Serial;

public class ResourceNotFoundException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;


    public ResourceNotFoundException(Object id) {
        super("Resource not found. ID " + id);
    }

}
