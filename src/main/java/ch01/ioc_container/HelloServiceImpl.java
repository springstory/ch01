package ch01.ioc_container;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


	public class HelloServiceImpl implements HelloService , BeanNameAware,
    BeanFactoryAware, InitializingBean, DisposableBean{
    private String name;
    private MyMessage  myMessage; 
    private String beanName;
    private BeanFactory beanFactory;
    
    public HelloServiceImpl() {
	super();
	System.out.println("1. default 생성자를 이용해서 빈 인스턴스 생성");
	}    
    
	public void setName(String name) {
		this.name = name;
		System.out.println("2. 의존성 체크 후 property로  빈 인스턴스 주입");
	}

	public void setMyMessage(MyMessage myMessage) {
		this.myMessage = myMessage;
		System.out.println("2. 의존성 체크 후 property로  빈 인스턴스 주입");
	}	

	@Override
	public void destroy() throws Exception {
		System.out.println("8. IoC컨테이너로부터 빈이 제거될때 정리, 종료 수행 메서드");
	}
	public void custom_end(){
		System.out.println("9. IOC컨테이너로부터 빈이 제거될때 사용자 겅의 종료 및 정리 수행 메서드");
	}

	@Override
	public void afterPropertiesSet() throws Exception {		
		System.out.println("5. 모든 property가 설정된 후 유효성 체크등의 수행하기 위한 용도");
	}
	public void custom_init(){
		System.out.println("6. 사용자 정의 초기화 메서드 ");
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("4. 스프링 컨테이너 객체 주입");	
	}
	
	@Override
	public void setBeanName(String arg0) {		
		System.out.println("3. 설정 파일에서의 빈 이름을 주입");
	}

	public MyMessage getMyMessage() {
		return myMessage;
	}	
	public String getName() {
		return name;
	}	 
	public void sayHello() {
		System.out.println("7. 빈의 서비스 메서드 호출");
		System.out.println(getMyMessage().getMessage());
	}	

}
