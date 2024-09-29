package library.Library.controller;

import jakarta.validation.Valid;
import library.Library.entity.AuthorityEntity;
import library.Library.repository.AuthorityRepository;
import library.Library.request.StudentRequest;
import library.Library.response.StudentResponse;
import library.Library.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final AuthorityRepository authorityRepository;

    @PostMapping("/register")
    public ResponseEntity<StudentResponse> register(@RequestBody @Valid StudentRequest request) {
        return userService.register(request);
    }

//    @GetMapping("/login")
//    public List<AuthorityEntity> login() {
//        var authentication = SecurityContextHolder.getContext().getAuthentication();
//        String username = authentication.getName();
//        return authorityRepository.findAllByUsername(username);
//    }
}
