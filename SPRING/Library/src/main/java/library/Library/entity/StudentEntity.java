package library.Library.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "students")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private LocalDate birthDate;

    private LocalDate registrationDate;

    @Email
    @Column(unique = true)
    private String email;


    @Column(unique = true)
    private String username;

    @OneToOne
    @JoinColumn(name = "user_id", unique = true)
    private User user;

}
