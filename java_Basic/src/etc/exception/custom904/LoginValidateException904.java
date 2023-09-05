package etc.exception.custom904;

//직접 만든 커스텀 오류

public class LoginValidateException904 extends Exception{

	
	//기본생성자
	public LoginValidateException904() {
		
	}
	
	//커스텀 에러 메세지를 받는 생성자.
	public LoginValidateException904(String message) {
		super(message);
	}
}
