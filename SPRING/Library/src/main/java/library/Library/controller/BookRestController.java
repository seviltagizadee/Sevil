package library.Library.controller;


import jakarta.validation.Valid;
import library.Library.exception.OurException;
import library.Library.request.BookAddRequestDTO;
import library.Library.request.BookUpdateRequestDTO;
import library.Library.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookRestController {

    private final BookService service;

    @PostMapping("/add")
    public void addBook(@Valid @RequestBody BookAddRequestDTO request, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new OurException("data integrity is compromised", "melumatlar tam deyil", bindingResult);

        }
        service.addBook(request);
    }


    @PutMapping
    public void updateBook(@Valid @RequestBody BookUpdateRequestDTO request, BindingResult bindingResult){

    }
}
