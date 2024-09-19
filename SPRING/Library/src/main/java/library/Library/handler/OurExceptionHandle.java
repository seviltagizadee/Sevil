package library.Library.handler;

import library.Library.exception.OurException;
import library.Library.response.ErrorResponse;
import models.MY;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class OurExceptionHandle {

    @ExceptionHandler
    public ErrorResponse handleException(OurException exception) {
        ErrorResponse resp = new ErrorResponse();
        resp.setMessage(exception.getMessage());
        BindingResult br = exception.getBindingResult();
        List<FieldError> fieldErrors = br.getFieldErrors();
        List<MY> errors = new ArrayList<>();
        for (FieldError e : fieldErrors) {
            MY error = new MY();
            error.setField(e.getField());
            error.setMessage(e.getDefaultMessage());
            errors.add(error);
        }
        resp.setFieldErrorList(fieldErrors);
        return resp;
    }
}
