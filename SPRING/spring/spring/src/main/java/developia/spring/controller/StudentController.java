package developia.spring.controller;

import developia.spring.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @GetMapping("/name/{name}")
    public Student getName(@PathVariable String name) {
        List<Student> list = List.of(new Student(1, "Sevil"), new Student(2, "Chinara"), new Student(3, "Nicat"), new Student(4, "Ali"), new Student(5, "Nubar"), new Student(6, "Xadica"), new Student(7, "Huseyn"), new Student(8, "Ruslan"), new Student(9, "Zarifa"), new Student(10, "Revan"));
        for (Student students : list) {
            if (students.getName().equals(name)) {
                return students;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Student not found");
    }

    @GetMapping("/list")
    public List<Student> getList(@RequestParam String name) {
        List<Student> list = List.of(new Student(1, "Sevil"), new Student(2, "Chinara"), new Student(3, "Nicat"), new Student(4, "Ali"), new Student(5, "Nubar"), new Student(6, "Xadica"), new Student(7, "Huseyn"), new Student(8, "Ruslan"), new Student(9, "Zarifa"), new Student(10, "Revan"));
        return list;
    }

}
