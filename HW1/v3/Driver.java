package v3;

import java.util.HashMap;
import java.util.Map;

public class Driver {

	public static void main(String[] args) {
		String templateStr = "Hello $name - that's a nice $color shirt.";
		Map<String, String> templateVars = new HashMap<String, String>();
		templateVars.put("$name", "Sheila");
		templateVars.put("$color", "green");
		
		Greeter myGreeter = new Greeter(templateStr);
		String greeting = myGreeter.getGreeting(templateVars);
		System.out.println(greeting);
	}

}
