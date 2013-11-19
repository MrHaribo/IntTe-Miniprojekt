package rClone.hsr.ch;

import java.util.HashMap;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class User {
	private String username = "Username";
	private String password;
	private String passRepeat;
	private boolean loggedIn = false;
	private HashMap<String, User> users;

	public User() {

	}

	public User(String username, String password) {
		setUsername(username);
		setPassword(password);
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	public String getPassRepeat() {
		return passRepeat;
	}

	public void setPassRepeat(String passRepeat) {
		this.passRepeat = passRepeat;
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
		if (users.containsKey(username)
				&& users.get(username).getPassword().equals(password))
			loggedIn = true;
		else
			loggedIn = false;

		return "loggedIn";

	}

	public String logOut() {
		username = "Username";
		password = "Password";
		loggedIn = false;

		return "loggedOut";

	}

	public String register() {
		if (!username.equals("") && !username.equals("Username")) {
			if (password.equals(passRepeat) && !users.containsKey(username)) {
				User u = new User(username, password);

				users.put(username, u);

				checkLogin();
				return "index.xhtml";
			}
		}
		return "register.xhtml";
	}

}
