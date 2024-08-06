package AbstractExa2;

abstract class Employee {
	private String name;
	private int id;
	
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	void m1() {
		System.out.println("name:"+ name);
	}
	
	
}
