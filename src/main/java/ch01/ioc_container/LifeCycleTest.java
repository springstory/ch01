package ch01.ioc_container;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class LifeCycleTest {
	   public static void main(String args[]){
		   Resource resource = new ClassPathResource("lifecycle.xml");
		   XmlBeanFactory beanFactory = new XmlBeanFactory(resource);
			String beanName = "helloService";
			HelloService service = beanFactory.getBean(beanName, HelloService.class);
			service.sayHello();
			//컨테이너로부터 빈 제거
			beanFactory.removeBeanDefinition(beanName);

	   }
}
