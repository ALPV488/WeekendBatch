package demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Company {
	
	public static void main(String[] args) {
		
//		ApplicationContext factory = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		Resource resource = new ClassPathResource("SpringConfig.xml");
		
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Employee emp= (Employee) factory.getBean("emp");
		
		Employee emp1 = (Employee) factory.getBean("emp2");
		
		System.out.println(emp1);
		
		System.out.println(emp);
		
	}

}
