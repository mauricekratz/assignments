package employeeAssignment;

public class EmployeeProject {

	private int projectID;
	private String projectName;
	private String clientName;

	public EmployeeProject(int projectID, String projectName, String clientName) {

		this.projectID = projectID;
		this.projectName = projectName;
		this.clientName = clientName;
	}
	
	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}
	
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public void setClientName (String clientName) {
		this.clientName = clientName;
	}
	
	public EmployeeProject() {
		
	}

	@Override
	public String toString() {
		return "EmployeeProject [projectID=" + projectID + ", projectName=" + projectName + ", clientName=" + clientName
				+ "]";
	}

	



	
	
	


}
