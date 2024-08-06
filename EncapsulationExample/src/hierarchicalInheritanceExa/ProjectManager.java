package hierarchicalInheritanceExa;

public class ProjectManager {
	String name ;
	int noOfProject;
	double rateOfInterest;

	public ProjectManager(String name, int noOfProject, double rateOfInterest) {
		super();
		this.name = name;
		this.noOfProject = noOfProject;
		this.rateOfInterest = rateOfInterest;
	}

	@Override
	public String toString() {
		return "ProjectManager [name=" + name + ", noOfProject=" + noOfProject + ", rateOfInterest=" + rateOfInterest
				+ "]";
	}

	void displayRateOfInterest() {
		System.out.println(rateOfInterest);
	}
	
}
