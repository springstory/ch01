package ch01.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/*
 * 결합도 테스트 
 * 
 * 결합도란? 소프트웨어 코드의 한 요소가 다른 것과 얼마나 강력하게 연결되어 있는지를 나타내는 말이다.
 * 객체와 객체가 연결되어 있다는 말은, 한 객체 안에서 다른 객체의 메소드를 호출하거나 멤버 변수에 접근할 때 
 * 두객체가 연결되어 있다는 것이다. 
 */
public class Test {

	public static void main(String[] args) {
		usePhone6();
		// G3 를 사용할때 usePhone1 같이 객체들이 직접결합되어 있을경우 
		// G3 를 사용하다가   S5 를 사용하게 되면 usePhone1 함수내에 수정해야 하는 것이  usePhone2 에서 처럼 많아진다.
		// (* 참고 : 이해를 돕기 위해 함수를 2가지(usePhone1, usePhone2)로 정의 했지만 사실, 하나로 정의되어야 하는 함수이다.)
		// 이렇게 객체를 변경하고자 할때, 수정해야 할 것이 많아진다면 유지보수는 어려워진다.
		// 따라서 , 다음과 같이 결합도를 떨어뜨려 유지보수를 용이하게 해야한다.
		// 1. 다형성을 이용한 결합도 떨어뜨리기
		//usePhone3(); 
		// 2. Factory 패턴을 이용한 결합도 떨어뜨리기 
		//usePhone5(); 
		// 이런 생성결합을 낮추기 위한 방법이 Factory 패턴이고 이 Factory 패턴이 적용된 것이 컨테이너 기능이다.
	}
	
	public static void usePhone1() {
		G3 phone = new G3();
		phone.TurnOn();
		phone.SendMessage();
		phone.MakeCall();
		phone.TurnOff();
	}
	
	public static void usePhone2() {
		S5 phone = new S5();
		phone.PowerOn();
		phone.SendSMS();
		phone.Ring();
		phone.PowerOff();
	}
	
	// 1. 다형성을 이용한 결합도 떨어뜨리기 위한 메소드 3,4 번 
	
	public static void usePhone3() {
		Phone phone = new G3Impl();
		phone.TurnOn();
		phone.SendMessage();
		phone.MakeCall();
		phone.TurnOff();
	}
	
	public static void usePhone4() {
		Phone phone = new S5Impl();
		phone.TurnOn();
		phone.SendMessage();
		phone.MakeCall();
		phone.TurnOff();
	}
	
	// 2. Factory 패턴을 이용한 결합도 떨어뜨리기  위한 메소드 5,6 번 
	
		public static void usePhone5() {
			MyBeanFactory factory = new MyBeanFactory();
			Phone phone = (Phone) factory.getBean("G3");
			phone.TurnOn();
			phone.SendMessage();
			phone.MakeCall();
			phone.TurnOff();
		}
		
		public static void usePhone6() {
			//ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
			MyBeanFactory factory = new MyBeanFactory();
			S5Impl phone = (S5Impl) factory.getBean("S5");
			//System.out.println(phone.getColor());
			phone.TurnOn();
			phone.SendMessage();
			phone.MakeCall();
			phone.TurnOff();
		}


	

}
