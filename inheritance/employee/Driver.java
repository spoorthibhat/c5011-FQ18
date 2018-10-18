package inheritance.employee;

public class Driver {
	public static void main(String [] args) {
		Manager m = new Manager("manager1");
		m.setSalary(10000);
		m.setBonus(500);
		System.out.println(m.toString());
		
		Employee e = new Manager("manager2");
		// bonus is not available
	}
}
