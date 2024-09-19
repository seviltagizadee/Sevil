package library.Library.response;

import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.FieldError;

import java.util.List;

@Getter
@Setter
public class ErrorResponse {
    private String message;
    private String internalmessage;
    @Setter
    @Getter
    private List<FieldError> fieldErrorList;

}

