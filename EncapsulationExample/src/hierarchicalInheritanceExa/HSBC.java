package hierarchicalInheritanceExa;

public class HSBC extends ProjectManager{
	double rateOfInterest;
	String bankName;
	
	
	public HSBC(String name, int noOfProject, double rateOfInterest, String bankName) {
		super(name, noOfProject, rateOfInterest);
		this.rateOfInterest= rateOfInterest;
		this.bankName=bankName;
	}
	
	@Override
	void displayRateOfInterest() {
		System.out.println("Rate of interest for : " +bankName+ " is " + rateOfInterest);
	}
	
}
