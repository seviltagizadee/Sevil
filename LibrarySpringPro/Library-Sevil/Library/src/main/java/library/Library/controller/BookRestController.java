package library.Library.controller;

import library.Library.request.BookAddRequest;
import library.Library.service.BookService;
import library.Library.service.BookServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookRestController {

    private final BookService service;
    @PostMapping
    public void addBook(@RequestBody BookAddRequest request){
       service.addBook(request);
    }
}
