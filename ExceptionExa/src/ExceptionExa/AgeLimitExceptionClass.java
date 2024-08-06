package ExceptionExa;

import java.util.Scanner;

class AgeLimitException extends Exception{
	static String message ="Age must be greater than 18";
	public AgeLimitException(int age) {
		super(message);
	}
}
public class AgeLimitExceptionClass {
	
	private static void Voting(int age) throws AgeLimitException{
		 if(age<18)
			 throw new AgeLimitException(age);
		 else System.out.println("You can vote");
		
	}
	public static void main(String[] args) {
		System.out.println("Enter your age: ");
		Scanner sc= new Scanner(System.in);
		int age = sc.nextInt();
		try {
			Voting(age);
		} catch (AgeLimitException e) {	
			System.out.println(e.getMessage());
			
		}		
	}
}
