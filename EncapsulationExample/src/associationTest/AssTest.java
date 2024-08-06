package associationTest;

public class AssTest {

	public static void main(String[] args) {
		Bank bk = new Bank();
		bk.setBankName("Hdfc");
		
		Employee[] emp = new Employee[2];
		emp[0]= new Employee();//pass by ref
		emp[1]= new Employee();
		
		emp[0].setName("Rutuja");
		emp[1].setName("Pooja");
		
		bk.setEmployee(emp);

		
		System.out.println(bk.getEmployee()[0].getName() + " is working in "+ bk.getBankName());
		System.out.println(bk.getEmployee()[1].getName() + " is working in "+ bk.getBankName());
		
	}

}