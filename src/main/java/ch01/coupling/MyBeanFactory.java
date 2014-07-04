package ch01.coupling;

public class MyBeanFactory {
	public Object getBean(String beanName) {
		if (beanName.equals("G3")) {
			return new G3Impl();
		} else if (beanName.equals("S5")) {
			return new S5Impl();
		}
		return null;
	}
}
