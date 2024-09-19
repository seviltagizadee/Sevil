package library.Library.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.validation.BindingResult;

@EqualsAndHashCode(callSuper = true)
@Data
public class OurException extends RuntimeException {
   private String internalmessage;
   private BindingResult bindingResult;

    public OurException(String message, String internalmessage, BindingResult bindingResult) {
        super(message);
        this.internalmessage = internalmessage;
        this.bindingResult = bindingResult;
    }

}
