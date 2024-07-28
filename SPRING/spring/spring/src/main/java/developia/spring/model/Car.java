package developia.spring.model;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private int price;
    @Column(name = "register_date")
    LocalDate registerDate;

    public Car( String brand, int price, LocalDate registerDate) {
        this.brand = brand;
        this.price = price;
        this.registerDate = registerDate;
    }
    public Car(){

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
