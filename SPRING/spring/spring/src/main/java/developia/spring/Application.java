package developia.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
 ApplicationContext context =SpringApplication.run(Application.class, args);
	Person p = context.getBean(Person.class);
		System.out.println("ID:"+p.getId());
		System.out.println("NAME:"+p.getName());
		System.out.println("AGE:"+p.getAge());
		System.out.println("SALARY:"+p.getSalary());
		 String[] beans = context.getBeanDefinitionNames();
		for (String bean: beans) {
			System.out.println(bean);
		}
	}

}
