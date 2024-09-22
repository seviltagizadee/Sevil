package library.Library.service;


import library.Library.request.StudentRequest;
import library.Library.response.StudentResponse;
import org.springframework.http.ResponseEntity;

public interface UserService{

    ResponseEntity<StudentResponse> register(StudentRequest studentRequest); //qeydiyyat

}
