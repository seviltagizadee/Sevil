package developia.spring.repository;

import developia.spring.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarRepo extends JpaRepository<Car,Long> {
    public List<Car> findAllByBrand(String brand);
}
