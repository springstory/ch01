package ch01.ioc_container;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import ch01.coupling.Phone;

public class IoCContainerTest {

	private static final Logger logger = LoggerFactory
			.getLogger(IoCContainerTest.class);

	public static void main(String[] args) {

		// beanFactory();
		applicationContext();

	}

	public static void beanFactory() {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"beans.xml"));
		// ApplicationContext context = new Class
		Phone phone = (Phone) factory.getBean("G3");
		Phone phone2 = factory.getBean("G3", Phone.class);
		phone.TurnOn();
		phone.SendMessage();
		phone.MakeCall();
		phone.TurnOff();
	}

	public static void applicationContext() {
		ApplicationContext factory = new ClassPathXmlApplicationContext(
				"beans.xml");
		Phone phone = (Phone) factory.getBean("S5");
		phone.TurnOn();
		phone.SendMessage();
		phone.MakeCall();
		phone.TurnOff();
	}
}
