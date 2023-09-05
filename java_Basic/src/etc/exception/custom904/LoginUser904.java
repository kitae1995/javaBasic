package etc.exception.custom904;

public class LoginUser904 {
	
	String userAccount; // 계정명
	String userPassword; // 비밀번호
	
	//객체가 생성될때 계정과 비밀번호가 지정됨
	public LoginUser904(String userAccount, String userPassword) {
		super();
		this.userAccount = userAccount;
		this.userPassword = userPassword;
	}
	
	//로그인 검증
	public String loginValidate(String inputAccout,String inputPassword) 
			throws LoginValidateException904 {
		
		//계정명이 일치하는가 ?
		if(userAccount.equals(inputAccout)) {
			//패스워드가 일치하는가?
			if(userPassword.equals(inputPassword)) {
				//로그인성공
				return "SUCCESS";
			}else {
				//패스워드가 틀림
				throw new LoginValidateException904("비밀번호 똑바로 치세요");
			}
		}else {
			//계정 정보가 틀림
			throw new LoginValidateException904("회원 가입부터 하세요!");
		}
	}
	
	

}
