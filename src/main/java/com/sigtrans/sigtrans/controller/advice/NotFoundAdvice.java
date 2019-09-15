package com.sigtrans.sigtrans.controller.advice;

import com.sigtrans.sigtrans.model.endereco.estado.EstadoNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class NotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(EstadoNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String estadoNotFoundHandler(EstadoNotFoundException ex) {
        return ex.getMessage();
    }
}
