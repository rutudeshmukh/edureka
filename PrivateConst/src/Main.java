class StaticP{
	int num1;
	int num2;
	int num3;
	
	StaticP(int num1,int num2,int num3){
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
	}
	public int add(int num1,int num2) {
		return num1+num2;
	}
	public int add(int num1,int num2,int num3) {
		return num1+num2+num3;
	}
	
}
public class Main {
	public static void main(String args[]) {
		StaticP sp = new StaticP();
		sp.add(1,3);
	}

}
