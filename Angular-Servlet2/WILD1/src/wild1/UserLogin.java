package wild1;

public class UserLogin {
	private String username;
	private String password;
	
	
	
	@Override
	public String toString() {
		return "UserLogin [Username=" + username + ", password=" + password + "]";
	}
	public UserLogin(String Username, String password) {
		super();
		// TODO Auto-generated constructor stub
		this.username=Username;
		this.password=password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}

