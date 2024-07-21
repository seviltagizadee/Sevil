package developia.spring.model;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    private int id;
    private String name;
    private int age;
    private Computer computer;

    public Employee(){
        id =15;
        name ="Nicat";
        age = 19;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}
