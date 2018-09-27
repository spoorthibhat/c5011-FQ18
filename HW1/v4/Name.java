package v4;

import java.util.Map;

public class Name {
	
	private final static String NAME_VAR = "$name";
	private String name;
	
	public Name(Map<String, String> dict) {	
		if (dict.containsKey(NAME_VAR)) {
			name = dict.get(NAME_VAR);
		} else {
	
			// TODO: add in functionality to get System.getProperty("user.name") 
			// if $name is not specified in the dictionary
		}
	}

	@Override
	public String toString() {
		return name;
	}
	
}
