package library.Library.service;

import library.Library.entity.StudentEntity;
import library.Library.entity.User;
import library.Library.exception.AlreadyExistsException;
import library.Library.repository.StudentRepository;
import library.Library.repository.UserRepository;
import library.Library.request.StudentRequest;
import library.Library.response.StudentResponse;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final StudentRepository studentRepository;
    private final ModelMapper mapper;


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
        user.setPassword(studentRequest.getPassword());
        userRepository.save(user);

        StudentResponse studentResponse = new StudentResponse();
        studentResponse.setUsername(studentRequest.getUsername());
        studentResponse.setStatus("ONLINE");

        return ResponseEntity.status(HttpStatus.CREATED).body(studentResponse);
    }
    
}
