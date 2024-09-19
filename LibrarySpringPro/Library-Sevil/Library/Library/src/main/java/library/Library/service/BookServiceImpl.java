package library.Library.service;


import library.Library.entity.BookRegistrationEntity;
import library.Library.repository.BookRegRepository;
import library.Library.request.BookAddRequestDTO;
import library.Library.request.BookUpdateRequestDTO;
import library.Library.response.BookListResponseDTO;
import library.Library.response.BookResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service

public class BookServiceImpl implements BookService {
    private final BookRegRepository repository;

    @Override
    public void addBook(BookAddRequestDTO bookAddRequest) {
        BookRegistrationEntity entity = new BookRegistrationEntity();
        entity.setBookName(bookAddRequest.getBookName());
        entity.setQuantity(bookAddRequest.getQuantity());
        entity.setPublishedDate(bookAddRequest.getPublishedDate());
        entity.setAuthor(bookAddRequest.getAuthor());
        repository.save(entity);
    }

    @Override
    public void updateBook(BookUpdateRequestDTO request) {

    }

    @Override
    public void deleteBook(Long id) {

    }

    @Override
    public BookListResponseDTO findAll() {
        return null;
    }

    @Override
    public BookResponseDTO findBYId(Long id) {
        return null;
    }
}
