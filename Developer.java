//Name: Necati
//Surname: Koçak
//Student ID: 150120053
import java.util.ArrayList;
import java.util.Calendar;

public class Developer extends RegularEmployee {
	private ArrayList<Project> projects = new ArrayList<Project>();
	public static int numberOfDevelopers=0;

	public Developer(int id, String firstName, String lastName, String gender, Calendar birthDate, String maritalStatus,
			String hasDriverLicence, double salary, Calendar hireDate, Department department, double performanceScore,
			ArrayList<Project> p) {
		super(id, firstName, lastName, gender, birthDate, maritalStatus, hasDriverLicence, salary, hireDate, department,
				performanceScore);
		numberOfDevelopers++;
	}

	public Developer(RegularEmployee re, ArrayList<Project> p) {
		super(re.getId(), re.getFirstName(), re.getLastName(), re.getGender(), re.getBirthDate(), re.getMaritalStatus(),
				re.getHasDriverLicence(), re.getSalary(), re.getHireDate(), re.getDepartment(),
				re.getPerformanceScore());
		numberOfDevelopers++;
	}

	public boolean addProject(Project s) {
		return projects.add(s);
	}

	public boolean removeProject(Project s) {
		return projects.remove(s);

	}

	public void setProjects(ArrayList<Project> projects) {
		this.projects = projects;
	}

	public ArrayList<Project> getProjects() {
		return projects;
	}

	public static void setNumberOfDevelopers(int numberOfDevelopers) {
		Developer.numberOfDevelopers = numberOfDevelopers;
	}

	public static int getNumberOfDevelopers() {
		return numberOfDevelopers;
	}

}
