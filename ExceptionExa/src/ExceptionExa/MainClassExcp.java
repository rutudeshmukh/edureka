package ExceptionExa;

import java.util.Scanner;

public class MainClassExcp {

	public static void main(String[ ] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int[] myNumbers = new int[6];
			for(int i=0;i<6;i++) {
				myNumbers[i]=sc.nextInt();
				}
			System.out.println(myNumbers[10]);
			} 
		catch (Exception e) {
			System.out.println("Something went wrong.");
		}
	}
			
}
