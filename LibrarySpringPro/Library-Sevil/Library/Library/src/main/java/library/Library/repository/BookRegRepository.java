package library.Library.repository;

import library.Library.entity.BookRegistrationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRegRepository extends JpaRepository<BookRegistrationEntity, Long> {

}
