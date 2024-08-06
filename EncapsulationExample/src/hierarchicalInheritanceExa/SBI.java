package hierarchicalInheritanceExa;

public class SBI extends ProjectManager {
	double rateOfInterest;
	String bankName;
	
	
	public SBI(String name, int noOfProject, double rateOfInterest, String bankName) {
		super(name, noOfProject, rateOfInterest);
		this.rateOfInterest= rateOfInterest;
		this.bankName=bankName;
	}

	@Override
	public String toString() {
		return "SBI [rateOfInterest=" + rateOfInterest + ", bankName=" + bankName + ", name=" + name + ", noOfProject="
				+ noOfProject + "]";
	}

	@Override
	void displayRateOfInterest() {
		System.out.println("Rate of interest for : " +bankName+ " is " + rateOfInterest);
	}
	
}
