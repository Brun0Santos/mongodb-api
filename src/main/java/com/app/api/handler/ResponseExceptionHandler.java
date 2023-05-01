package com.app.api.handler;

import com.app.api.exceptions.NotFoundException;
import com.app.api.exceptions.ResponseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@ControllerAdvice
public class ResponseExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ResponseException> notFound(NotFoundException ex, WebRequest request) {
        ResponseException responseException = new ResponseException(LocalDateTime.now() , ex.getMessage(),
                request.getDescription(false));
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseException);
    }
}
