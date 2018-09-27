package v2;

public class Driver {

	public static void main(String[] args) {
		Greeter g = new Greeter("world");
		String greeting = g.getGreeting();
		System.out.println(greeting);
	}

}
