package ch01.ioc_container;

public class MyTime {
	private String time;

	public MyTime() {
		super();
	}

	public MyTime(String time) {
		super();
		this.time = time;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "MyTime [time=" + time + "]";
	}

}
