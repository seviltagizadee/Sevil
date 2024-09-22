package library.Library.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;


@Data
public class BookAddRequestDTO {

    @NotNull(message = "name is absolute")
    @Size(min = 1,max = 100, message = "size of bookName greater than 1 and smaller than 100")
    private String bookName;

    @NotNull(message = "author is absolute")
    private String author;

    @NotNull(message = "quantity is absolute")
    private Integer quantity;


    private String publishedDate;
    private LocalDate registrationDate;
}
