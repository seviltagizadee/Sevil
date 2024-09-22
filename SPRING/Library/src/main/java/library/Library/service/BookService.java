package library.Library.service;


import library.Library.entity.BookRegistrationEntity;
import library.Library.request.BookAddRequestDTO;
import library.Library.request.BookUpdateRequestDTO;
import library.Library.response.BookListResponseDTO;
import library.Library.response.BookResponseDTO;
import library.Library.response.BookUpdateResponseDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface BookService {
    ResponseEntity<BookListResponseDTO> addBook(BookAddRequestDTO bookAddRequest);

    ResponseEntity<BookUpdateResponseDTO> update(BookUpdateRequestDTO bookUpdateRequestDTO);

    void deleteBook(Long id);

    ResponseEntity<List<BookRegistrationEntity>> findAll();

    BookResponseDTO findById(Long id);
}
