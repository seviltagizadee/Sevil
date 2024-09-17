package library.Library.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "library")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookRegistrationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
      private Long id;

      private String bookName;

      private String author;

      private double price;

      private int quantity;

      private String publishedDate;

}


