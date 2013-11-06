package rClone.hsr.ch;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class User {
	private String username = "Username";
	private String password = "Password";
	private boolean loggedIn = true;
	
	
	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	public User(String username, String password) {
		setUsername(username);
		setPassword(password);
	}
	
	public User(){
		
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
