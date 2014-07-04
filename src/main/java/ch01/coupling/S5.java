package ch01.coupling;

public class S5 {

	public void PowerOn() {
		System.out.println(this.getClass().getSimpleName() + " 전원을 켠다");

	}

	public void PowerOff() {
		System.out.println(this.getClass().getSimpleName() + " 전원을 끈다");

	}

	public void SendSMS() {
		System.out.println(this.getClass().getSimpleName() + " 문자를 보내다");

	}

	public void Ring() {
		System.out.println(this.getClass().getSimpleName() + " 전화를 걸다");

	}

}
