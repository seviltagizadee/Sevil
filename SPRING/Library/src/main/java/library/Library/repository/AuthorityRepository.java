package library.Library.repository;

import library.Library.entity.AuthorityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface AuthorityRepository extends JpaRepository<AuthorityEntity, Long> {

        List<AuthorityEntity> findAllByUsername(String username);
    }

