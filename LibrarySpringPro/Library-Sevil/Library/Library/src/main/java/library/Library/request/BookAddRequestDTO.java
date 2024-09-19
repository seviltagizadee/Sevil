package library.Library.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class BookAddRequestDTO {

    @NotNull(message = "name is absolute")
    @NotBlank(message = "the name cannot be left blank")
    @Size(min = 1,max = 100, message = "size of bookName greater than 1 and smaller than 100")
    private String bookName;

    @NotNull(message = "author is absolute")
    @NotBlank(message = "the author cannot be left blank")
    private String author;

    @NotNull(message = "quantity is absolute")
    @NotBlank(message = "the quantity cannot be left blank")
    private int quantity;


    private String publishedDate;
}
