package developia.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
  SpringApplication.run(Application.class, args);
	//Person p = context.getBean(Person.class);
//		System.out.println("ID:"+p.getId());
//		System.out.println("NAME:"+p.getName());
//		System.out.println("AGE:"+p.getAge());
//		System.out.println("SALARY:"+p.getSalary());
//     Employee e =context.getBean(Employee.class);
//		System.out.println("ID:"+e.getId());
//		System.out.println("NAME:"+e.getName());
//		System.out.println("AGE:"+e.getAge());
//		 String[] beans = context.getBeanDefinitionNames();
//		for (String bean: beans) {
//			System.out.println(bean);
//		}

//		Home home1 = context.getBean(Home.class);
//		System.out.println(home1.getId());
//		System.out.println(home1.getAddress());
//		System.out.println(home1.getColor());
//
//		Home home2 = context.getBean(Home.class);
//		System.out.println(home2.getId());
//		System.out.println(home2.getAddress());
//		System.out.println(home2.getColor());
	}

}
