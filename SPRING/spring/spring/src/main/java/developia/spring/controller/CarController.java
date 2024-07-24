package developia.spring.controller;

import developia.spring.model.Car;
import developia.spring.model.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarRepo repo;
    @GetMapping("/save")
    public void saveCar(){
        LocalDate localDateBmw =LocalDate.of(2023,5,25);
        Car car1 = new Car("BMW",100_000,localDateBmw);
        repo.save(car1);

        LocalDate localDateToyoto =LocalDate.of(2023,7,5);
        Car car2 = new Car("Toyoto",20_000,localDateToyoto);
        repo.save(car2);

        LocalDate localDateMercedes =LocalDate.of(2024,2,20);
        Car car3 = new Car("Mercedes",30_000,localDateMercedes);
        repo.save(car3);
    }
}
