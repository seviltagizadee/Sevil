package library.Library.controller;


import jakarta.validation.Valid;
import library.Library.entity.BookRegistrationEntity;
import library.Library.request.BookAddRequestDTO;
import library.Library.request.BookUpdateRequestDTO;
import library.Library.response.BookListResponseDTO;
import library.Library.response.BookResponseDTO;
import library.Library.response.BookUpdateResponseDTO;
import library.Library.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookRestController {

    private final BookService service;

    @PreAuthorize(value = "hasAuthority('ROLE_ADD_BOOK')")
    @PostMapping("/add")
    public ResponseEntity<BookListResponseDTO> add(@RequestBody @Valid BookAddRequestDTO requestDTO) {
        return service.addBook(requestDTO);
    }

    @PreAuthorize(value = "hasAuthority('ROLE_UPDATE_BOOK')")
    @PutMapping
    public ResponseEntity<BookUpdateResponseDTO> updateBook(@RequestBody @Valid BookUpdateRequestDTO requestDTO) {
        return service.update(requestDTO);
    }

    @DeleteMapping(path = "/{Id}")
    public void deleteBook(@PathVariable Long Id) {
        service.deleteBook(Id);
    }


    @GetMapping
    public ResponseEntity<List<BookRegistrationEntity>> findAll() {
        return service.findAll();
    }

    @GetMapping("/{bookId}")
    public BookResponseDTO findById(@PathVariable Long bookId) {
        return service.findById(bookId);
    }
}
