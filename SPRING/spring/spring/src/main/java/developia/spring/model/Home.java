package developia.spring.model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Home {
    private int id;
    private String address;
    private String color;

    public Home(){
        id = 40;
        address = "Heyder Eliyev Prospekti";
        color = "grey";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @PostConstruct
    public void initMethod(){
        System.out.println("Init Method");
    }
   @PreDestroy
    public void destroyMethod(){
        System.out.println("Destroy Method");
    }
}
