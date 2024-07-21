package developia.spring.config;

import developia.spring.model.Computer;
import developia.spring.model.Employee;
import developia.spring.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfic {
    @Bean
    public Person myPerson(){
        Person p = new Person();
        p.setAge(23);
        return p;
    }

    @Bean
    public Employee employee(){
        Employee e = new Employee();
        e.setComputer(computer());
        return e;
    }
    @Bean
    public Computer computer() {
        return new Computer();
    }
}
