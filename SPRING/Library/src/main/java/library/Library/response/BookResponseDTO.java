package library.Library.response;

import lombok.Data;

import java.time.LocalDate;
@Data
public class BookResponseDTO {
    private Long id;

    private String bookName;

    private String author;

    private int quantity;

    private String publishedDate;

    private LocalDate registrationDate;


}
