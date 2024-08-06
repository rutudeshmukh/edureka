package FunctionalInterface;

class Cpu{
	double price;
	class Processer{
		double cores;
		String manufacturer;
		
		double getCache() {
			return 5.3;
		}
	}
	protected class Ram{
		double memory;
		String manufacturer;
		
		double getClockSpeed() {
			return 8.5;
		}
	}
}
public class InnerClassDemo {

	public static void main(String[] args) {
		
		Cpu c1 = new Cpu();
		Cpu.Processer p = c1.new Processer();
		
		System.out.println(p.getCache());
 
		
	}

}
