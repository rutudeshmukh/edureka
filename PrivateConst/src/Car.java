
public class Car {
	static int value;
	static String name;
	
	public static int getValue() {
		return value;
	}

	public static void setValue(int value) {
		Car.value = value;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Car.name = name;
	}

	private Car(int value, String name) {
		this.value=value;
		this.name=name;
	}
	
}
