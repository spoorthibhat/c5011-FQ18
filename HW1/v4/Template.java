package v4;

import java.util.Map;

public class Template {
	
	private String[] words;
	
	public Template(String s) {
		words = s.split("\\s");
	}
	
	private boolean isVariable(String s) { 
		return s.charAt(0) == '$'; 
	}
	
	public String instantiate(Map<String, String> args) {
		String[] sa = new String[words.length];
		for (int i = 0; i < words.length; i++) {
			if (isVariable(words[i])) {
				if (words[i].equals("$daypart")) 
					sa[i] = (new DayPart()).toString();
				else if (args.containsKey(words[i]))
					sa[i] = args.get(words[i]);
			} else {
				sa[i] = words[i];
			}
		}
		return String.join(" ", sa);
	}
	
}
