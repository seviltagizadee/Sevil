package developia.spring.model;

import org.springframework.stereotype.Component;

@Component
public class Person {
    int id;
    String name;
    int age;
    double salary;

    public Person(){
        id = 12;
        name = "Sevil";
        age = 19;
        salary =1500;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
