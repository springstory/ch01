package ch01.coupling;

public class G3Impl implements Phone {

	private String color;

	public G3Impl() {
		super();
	}

	public G3Impl(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

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
