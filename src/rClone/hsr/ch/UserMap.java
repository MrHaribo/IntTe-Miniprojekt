package rClone.hsr.ch;

import java.util.HashMap;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class UserMap {

	public HashMap<String, User> users;

	public UserMap() {
		users = new HashMap<String, User>();
		
		User u1 = new User("MaxMuster", "passwort");
		User u2 = new User("Test", "test");

		users.put(u1.getUsername(), u1);
		users.put(u2.getUsername(), u2);

	}
	
	public User checkUser(String username) {
		if (users.containsKey(username)){
			return users.get(username);
		} else return null;
	}
	
	public String login(String username, String password) {
			User u = checkUser(username);
			
			if(u!=null) {
				if (u.getPassword().equals(password)) return "loggedIn.xhtml";
			}
			
		return "loggedOut.xhtml";
	}
	
}
