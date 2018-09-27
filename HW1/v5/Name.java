package v5;

import java.util.Map;

public class Name {
	
	private final static String NAME_VAR = "$name";
	private String name;
	
	public Name(Map<String, String> dict) {
		if (dict.containsKey(NAME_VAR)) {
			name = dict.get(NAME_VAR);
		} else {
			String username = System.getProperty("user.name");
			if (username == null || username.length() == 0) {
				name = "Unnamed user";
			} else {
				name = username.substring(0, 1).toUpperCase() + username.substring(1);
			}
		}
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}
