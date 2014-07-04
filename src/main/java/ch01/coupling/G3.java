package ch01.coupling;

public class G3 {

	public void TurnOn() {
		System.out.println(this.getClass().getSimpleName() + " 전원을 켠다");

	}

	public void TurnOff() {
		System.out.println(this.getClass().getSimpleName() + " 전원을 끈다");

	}

	public void SendMessage() {
		System.out.println(this.getClass().getSimpleName() + " 문자를 보내다");

	}

	public void MakeCall() {
		System.out.println(this.getClass().getSimpleName() + " 전화를 걸다");

	}

}
