package rClone.hsr.ch;

import java.util.HashMap;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class User {
	private String username = "Username";
	private String password = "Password";
	private boolean loggedIn = false;
	private HashMap<String, User> users;
	
	public User(){
		
	}
	
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
	
	public String checkLogin() {
		if (users.containsKey(username) && users.get(username).getPassword().equals(password))  
			loggedIn = true;
		else 
			loggedIn = false;
		
		return "linklist.xhtml";
	}
	
	public String logOut() {
		username="Username";
		password="Password";
		loggedIn=false;
		
		return "linklist.xhtml";
	}
	
	public String register() {
		User u = new User();
		u.setPassword(password);
		u.setUsername(username);
		
		users.put(username, u);
		
		checkLogin();
		
		return "linklist.xhtml";
	}
	
	
}
