package ch01.ioc_container;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class LifeCycleTest {
	   public static void main(String args[]){
		   XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("lifecycle.xml"));
			HelloService service = beanFactory.getBean("helloService", HelloService.class);
			System.out.println(service);
			service = beanFactory.getBean("helloService", HelloService.class);
			System.out.println(service);
			service = beanFactory.getBean("helloService", HelloService.class);
			System.out.println(service);
			service.sayHello();
			//컨테이너로부터 빈 제거
			beanFactory.removeBeanDefinition("helloService");

	   }
}
