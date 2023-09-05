package etc.exception.custom904;

public class MainClass {

	public static void main(String[] args) {
		
		LoginUser904 user = new LoginUser904("abc1234","aaa1111");
		
		try {
			String result = user.loginValidate("abc1234", "aaa1111!");
			System.out.println(result);
		} catch (LoginValidateException904 e) {
			e.printStackTrace();
		}

	}

}
