package SDET21.POJO.Class;

public class ProjectLibrary {
	// create global variables
		String CreatedBy;
		String projectName;
		String status;
		int teamSize;

		// Initialize all the variables using constructor
		public ProjectLibrary(String createdBy, String projectName, String status, int teamSize) {

			CreatedBy = createdBy;
			this.projectName = projectName;
			this.status = status;
			this.teamSize = teamSize;
		}

		// Use getter and setter to access the variables
		public String getCreatedBy() {
			return CreatedBy;
		}

		public void setCreatedBy(String createdBy) {
			CreatedBy = createdBy;
		}

		public String getProjectName() {
			return projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public int getTeamSize() {
			return teamSize;
		}

	}


