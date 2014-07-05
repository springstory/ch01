package ch01.ioc_container;

public class MyMessage implements Message{
	private String message;

	public MyMessage() {
		super();
	}
	 

	public void setMessage(String message) {
		this.message = message;
	}


	@Override
	public String getMessage() {
		return  message;
	}
	
	
}