package developia.spring.controller;

import developia.spring.exception.OurException;
import developia.spring.exception.Response;
import developia.spring.model.Car;
import developia.spring.repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarRepo repo;
    @GetMapping("/save")
    public List<Car> saveCar(){
        LocalDate localDateBmw =LocalDate.of(2023,5,25);
        Car car1 = new Car("BMW",100_000,localDateBmw);
        repo.save(car1);

        LocalDate localDateToyoto =LocalDate.of(2023,7,5);
        Car car2 = new Car("Toyoto",20_000,localDateToyoto);
        repo.save(car2);

        LocalDate localDateMercedes =LocalDate.of(2024,2,20);
        Car car3 = new Car("Mercedes",30_000,localDateMercedes);
        repo.save(car3);

        return repo.findAll();

    }

    @GetMapping("/find/{id}")
     public Car findById(@PathVariable Long id){
        Optional<Car> result = repo.findById(id);
        if (result.isPresent()){
            return result.get();
        }else{
            throw new OurException("Car not found id= " +id,"Car have not in list");
        }
    }
    @ExceptionHandler
    public Response handleOurException(OurException exception){
        Response response = new Response();
        response.setMessage("Car not found");
        response.setInternalMessage("Car have not in list");
     return response;
    }

    @GetMapping("findBrand")
    public List<Car> findBrand(@RequestParam(name = "brand") String brand){
        List<Car> allByBrand = repo.findAllByBrand(brand);
        return  allByBrand;
    }

}
