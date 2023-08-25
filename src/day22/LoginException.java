package day22;

public class LoginException extends Exception {
	private String errorMessage;
	
	public LoginException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}
	
	public void printErrorMessage() {
		System.out.printf("錯誤訊息: %s\n", errorMessage);
	}
	
}
