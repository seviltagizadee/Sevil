package library.Library.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class BookAddRequest {

    private String bookName;

    private String author;

    private double price;

    private int quantity;

    private String publishedDate;
}
