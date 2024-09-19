package library.Library.service;


import library.Library.request.BookAddRequestDTO;
import library.Library.request.BookUpdateRequestDTO;
import library.Library.response.BookListResponseDTO;
import library.Library.response.BookResponseDTO;


public interface BookService {
    void addBook(BookAddRequestDTO bookAddRequest);

    void updateBook(BookUpdateRequestDTO request);

    void deleteBook(Long id);

    BookListResponseDTO findAll();

    BookResponseDTO findBYId(Long id);
}
