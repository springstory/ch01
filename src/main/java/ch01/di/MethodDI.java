package ch01.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ch01.coupling.Phone;

public class MethodDI {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Phone p =context.getBean("method", Phone.class);
		System.out.println(p.getClass().getSimpleName());
	}
}
