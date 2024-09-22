package library.Library.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @NotNull
    @Column(unique = true)
    private String username;

    @OneToOne(mappedBy = "user") // mappedby-neden asili oldugunu gosterir
    private StudentEntity student;

    @NotNull
    private String password;

}
