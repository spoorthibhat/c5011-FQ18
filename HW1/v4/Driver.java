package v4;

import java.util.HashMap;
import java.util.Map;

public class Driver {

	public static void main(String[] args) {
		String template = "Good $daypart $name - that's a nice $color shirt.";
		Map<String, String> templateVars = new HashMap<String, String>();
		templateVars.put("$name", "Sheila");
		templateVars.put("$color", "green");
		
		Greeter g = new Greeter(template);
		String greeting = g.getGreeting(templateVars);
		System.out.println(greeting);
	}

}
