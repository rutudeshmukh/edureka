package SingleInheritanceExa;

public class TeamLead {
	int pid;
	String pname;
	String empId;
	
	public TeamLead(int pid, String pname, String empId) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.empId = empId;
	}

	public void display() {
		System.out.println("pid=" + pid + " pname=" + pname + "empId=" + empId );
		
	}
}
