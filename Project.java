//Name: Necati
//Surname: Koçak
//Student ID: 150120053

import java.util.Calendar;


public class Project {
	private String projectName;
	private Calendar startDate;
	private boolean state;

	public Project(String pName, Calendar startDate, String state) {
		projectName=pName;
		this.startDate=startDate;
		setState(state);
	}
	
	public Project() {
	}

	public void setState(String state) {
		if (state.equals("“Open")) {
			this.state = true;
		} else if (state.equals("Close")) {
			this.state = false;
		} else {
			throw new IllegalArgumentException("Wrong Argument");
		}
	}
	
	

	public String getState() {
		if (this.state == true) {
			return "Open";
		} else {
			return "Close";
		}

	}

	public void close() {
		if (state) {
			setState("Close");
		}
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}

	public Calendar getStartDate() {
		return startDate;
	}

	@Override
	public String toString() {
		return "Project [projectName=" + projectName + ", startDate=" + startDate + ", state=" + state + "]";
	}

}