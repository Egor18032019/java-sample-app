package com.example.soft.exception;

import com.example.soft.schemas.Error;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<Error> handleException(BadRequestException exception) {
        return new ResponseEntity<>(new Error( 400+" Bad Request", "validate error"), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public ResponseEntity<Error> handleException(MissingPathVariableException exception) {
        return new ResponseEntity<>(new Error( 400+" Bad Request", "validate error"), HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<?> handleException(HttpMessageNotReadableException e) {
        return new ResponseEntity<>(new Error( 400+" Bad Request", "validate error"), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public ResponseEntity<Error> handleException(ChangeSetPersister.NotFoundException exception) {
        return new ResponseEntity<>(new Error( 400+" Bad Request", "validate error"), HttpStatus.BAD_REQUEST);
    }
}