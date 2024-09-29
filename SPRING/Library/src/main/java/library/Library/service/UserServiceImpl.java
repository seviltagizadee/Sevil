package library.Library.service;

import library.Library.entity.AuthorityEntity;
import library.Library.entity.StudentEntity;
import library.Library.entity.User;
import library.Library.exception.AlreadyExistsException;
import library.Library.repository.AuthorityRepository;
import library.Library.repository.StudentRepository;
import library.Library.repository.UserRepository;
import library.Library.request.StudentRequest;
import library.Library.response.StudentResponse;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final StudentRepository studentRepository;
//    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final AuthorityRepository authorityRepository;
    private final ModelMapper mapper;

    // private final List<String> authorityList = Arrays.asList("ROLE_USER", "ROLE_READER");


    @Override
    public ResponseEntity<StudentResponse> register(StudentRequest studentRequest) {

        if (userRepository.findByUsername(studentRequest.getUsername()).isPresent()) {
            throw new AlreadyExistsException("Username already exists");
        }

        StudentEntity studentEntity = new StudentEntity();
        mapper.map(studentRequest, studentEntity);
        studentEntity.setRegistrationDate(LocalDate.now());
        studentRepository.save(studentEntity);

        User user = new User();
        user.setUsername(studentRequest.getUsername());
        // user.setPassword(bCryptPasswordEncoder.encode(studentRequest.getPassword()));
        user.setPassword(studentRequest.getPassword());
        userRepository.save(user);

//        for (String authority : authorityList) {
//            AuthorityEntity authorityEntity = new AuthorityEntity(user.getUsername(), authority);
//            authorityRepository.save(authorityEntity); // Save authority to database
//        }

        StudentResponse studentResponse = new StudentResponse();
        studentResponse.setUsername(studentRequest.getUsername());
        studentResponse.setStatus("ONLINE");

        return ResponseEntity.status(HttpStatus.CREATED).body(studentResponse);
    }
    
}
