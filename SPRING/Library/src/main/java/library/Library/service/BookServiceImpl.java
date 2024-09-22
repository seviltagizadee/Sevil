package library.Library.service;


import library.Library.entity.BookRegistrationEntity;
import library.Library.exception.BookNotFoundException;
import library.Library.repository.BookRegRepository;
import library.Library.request.BookAddRequestDTO;
import library.Library.request.BookUpdateRequestDTO;
import library.Library.response.BookListResponseDTO;
import library.Library.response.BookResponseDTO;
import library.Library.response.BookUpdateResponseDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service

public class BookServiceImpl implements BookService {
    private final BookRegRepository repository;

 //   private final ModelMapper mapper;

    @Override
    public ResponseEntity<BookListResponseDTO> addBook(BookAddRequestDTO bookAddRequest) {

        BookRegistrationEntity book = new BookRegistrationEntity();
        book.setBookName(bookAddRequest.getBookName());
        book.setAuthor(bookAddRequest.getAuthor());
        book.setQuantity(bookAddRequest.getQuantity());
        book.setPublishedDate(bookAddRequest.getPublishedDate());
      //  mapper.map(bookAddRequest,book);
        book.setRegistrationDate(LocalDate.now());
        book.setUpdatedDate(LocalDate.now());

        repository.save(book);

        BookListResponseDTO responseDTO = new BookListResponseDTO();
        responseDTO.setMessage("Created successfully"); // obyekt yarananda mesaj

        return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
    }

    @Override
    public ResponseEntity<BookUpdateResponseDTO> update(BookUpdateRequestDTO bookUpdateRequest) {
        Long id = bookUpdateRequest.getId();
        Optional<BookRegistrationEntity> book = repository.findById(id);
        if (book.isPresent()) {
            BookRegistrationEntity updatedBook = book.get();
            updatedBook.setBookName(bookUpdateRequest.getBookName());
            updatedBook.setAuthor(bookUpdateRequest.getAuthor());
            updatedBook.setQuantity(bookUpdateRequest.getQuantity());
            updatedBook.setPublishedDate(bookUpdateRequest.getPublishedDate());
         //   mapper.map(bookUpdateRequest, updatedBook);
            updatedBook.setUpdatedDate(LocalDate.now());
            repository.save(updatedBook);
        }
        else {
            throw new BookNotFoundException("Book not found" + id);
        }

        BookUpdateResponseDTO responseDTO = new BookUpdateResponseDTO();
        responseDTO.setMessage("Updated successfully");

        return ResponseEntity.ok(responseDTO);
    }


    @Override
    public void deleteBook(Long id) {
     repository.deleteById(id);
    }

    @Override
    public ResponseEntity<List<BookRegistrationEntity>> findAll() {
        return null;
    }


    @Override
    public BookResponseDTO findBYId(Long id) {
        return null;
    }
}
