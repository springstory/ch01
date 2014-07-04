package ch01.coupling;

public class S5Impl implements Phone {

	@Override
	public void TurnOn() {
		System.out.println(this.getClass().getSimpleName() + " 전원을 켠다");
		
	}

	@Override
	public void TurnOff() {
		System.out.println(this.getClass().getSimpleName() + " 전원을 끈다");
		
	}

	@Override
	public void SendMessage() {
		System.out.println(this.getClass().getSimpleName() + " 문자를 보내다");
		
	}

	@Override
	public void MakeCall() {
		System.out.println(this.getClass().getSimpleName() + " 전화를 걸다");
		
	}

}
