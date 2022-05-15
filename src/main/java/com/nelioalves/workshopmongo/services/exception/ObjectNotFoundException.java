package com.nelioalves.workshopmongo.services.exception;

import java.util.function.Supplier;

public class ObjectNotFoundException extends RuntimeException {
    public ObjectNotFoundException(String msg) {
        super(msg);
    }
}
