package jspbook;


public class LoginDAO {
	//사용자
	private String userid;
	private String password;
	
	//DB로부터 가져온 아이디 비밀번호라고 가정
	final String _userid = "myuser";
	final String _password = "12345";
	
	//로그인시 아이디가 회원의 아이디인지 -> 비번일치
	public boolean checkUser() {
		if(userid.isEmpty() || password.isEmpty()) {
			System.out.println("비어있습니다. ");
			return false;
		}
		else if (userid.equals(_userid)&& password.equals(_password)) {
			return true;
		}
		else 
			return false;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
