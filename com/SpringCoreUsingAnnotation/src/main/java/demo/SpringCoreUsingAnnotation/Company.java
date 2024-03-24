package demo.SpringCoreUsingAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("demo.SpringCoreUsingAnnotation")
public class Company {

	public static void main(String[] args) {

		ApplicationContext factory = new AnnotationConfigApplicationContext(Company.class);

		Employee emp = (Employee) factory.getBean("emp");

		System.out.println(emp);
		
		Address add=(Address) factory.getBean("add");
		
		System.out.println(add);

	}

}
