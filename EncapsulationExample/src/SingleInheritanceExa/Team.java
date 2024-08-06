package SingleInheritanceExa;

public class Team extends TeamLead {
	String teamName;
	String projectName;
	int noOfEmployee;
	
	public Team(int pid, String pname, String empId, String teamName, String projectName, int noOfEmployee) {
		super(pid, pname, empId);
		this.teamName = teamName;
		this.projectName = projectName;
		this.noOfEmployee = noOfEmployee;
	}
	
	@Override
	public void display() {
		System.out.println("TeamName=" + teamName + ", projectName=" + projectName + ", noOfEmployee=" + noOfEmployee
				+ ", pid=" + pid + ", pname=" + pname + ", empId=" + empId );
	}

}
