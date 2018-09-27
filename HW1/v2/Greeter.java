package v2;

public class Greeter {
	
	public Greeter(String word) {
		this.word = word;
	}

	public String getGreeting() {
		return "Hello, " + word + "!";
	}

	private String word;
	
}
