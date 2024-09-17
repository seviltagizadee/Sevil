package library.Library.service;

import library.Library.request.BookAddRequest;
import library.Library.response.BookListResponseDTO;
import library.Library.response.BookResponseDTO;
import org.springframework.stereotype.Service;

import java.awt.print.Book;

@Service
public interface BookService {
    void addBook(BookAddRequest bookAddRequest);
    void deleteBook(Long id);
    BookListResponseDTO findAll();
    BookResponseDTO findBYId(Long id);
}
