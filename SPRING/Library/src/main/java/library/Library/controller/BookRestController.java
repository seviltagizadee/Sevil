package library.Library.controller;


import jakarta.validation.Valid;
import library.Library.request.BookAddRequestDTO;
import library.Library.request.BookUpdateRequestDTO;
import library.Library.response.BookListResponseDTO;
import library.Library.response.BookUpdateResponseDTO;
import library.Library.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookRestController {

    private final BookService service;

    @PostMapping("/add")
    public ResponseEntity<BookListResponseDTO> add(@RequestBody @Valid BookAddRequestDTO requestDTO) {
        return service.addBook(requestDTO);
    }


    @PutMapping("/{Id}")
    public ResponseEntity<BookUpdateResponseDTO> updateBook(@RequestBody @Valid BookUpdateRequestDTO requestDTO) {
        return service.update(requestDTO);
    }

    @DeleteMapping(path = "/{Id}")
    public void deleteBook(@PathVariable Long Id) {
        service.deleteBook(Id);
    }
}
