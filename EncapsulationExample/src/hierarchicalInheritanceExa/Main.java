package hierarchicalInheritanceExa;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Which bank you want to visit:");
		System.out.println("1: HSBC");
		System.out.println("2: CitiBank");
		System.out.println("3: Axis");
		System.out.println("4:SBI");
		int choice = sc.nextInt();
		 switch(choice) {
		 case 1:{
			HSBC B= new HSBC("Rutuja", 12, 0.8, "HSBC");
			B.displayRateOfInterest();
			System.out.println(B);
			break;
		 }
		 case 2:{
			CitiBank C= new CitiBank("Rutuja", 12, 0.7, "CitiBank");
			C.displayRateOfInterest();
			System.out.println(C);
			break;
		 }
		 case 3:{
			Axis A= new Axis("Rutuja", 12, 0.6, "Axis");
			A.displayRateOfInterest();
			System.out.println(A);
			break;
		 }
		 case 4:{
			SBI S= new SBI("Rutuja", 12, 0.5, "SBI");
			S.displayRateOfInterest();
			System.out.println(S);
			break;
		}
		 default:{
			 System.out.println("Invalid choice. Please select again.");
		 }
		 }
	}
}
	

