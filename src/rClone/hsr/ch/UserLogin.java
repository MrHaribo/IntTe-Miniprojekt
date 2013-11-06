package rClone.hsr.ch;

import java.util.HashMap;

public class UserLogin {

	private String username;
	private String password;
	private boolean loggedIn = false;
	private HashMap<String, User> users;

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


	public HashMap<String, User> getUsers() {
		return users;
	}


	public void setUsers(HashMap<String, User> users) {
		this.users = users;
	}
	
	public boolean isLoggedIn() {
		return loggedIn;
	}


	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
	
	public String login(){
	
	
		if (users.containsKey(this.username)){
			if (this.password.equals(users.get(this.username).getPassword())) {
				setLoggedIn(true);
				return "loggedIn";
			}
		}
		return "loggedOut";
	}



	
}
