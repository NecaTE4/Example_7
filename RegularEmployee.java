//Name: Necati
//Surname: Koçak
//Student ID: 150120053

import java.util.Calendar;

public class RegularEmployee extends Employee {
	private double performanceScore;
	private double bonus;

	public RegularEmployee(int id, String firstName, String lastName, String gender, Calendar birthDate,
			String maritalStatus, String hasDriverLicence, double salary, Calendar hireDate, Department department,
			double performanceScore) {
		super(id, firstName, lastName, gender, birthDate, maritalStatus, hasDriverLicence, salary, hireDate,
				department);
	}

	public RegularEmployee(Employee employee, double performanceScore) {
		super(employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getGender(),
				employee.getBirthDate(), employee.getMaritalStatus(), employee.getHasDriverLicence(),
				employee.getSalary(), employee.getHireDate(), employee.getDepartment());
	}

	public void setPerformanceScore(double performanceScore) {
		this.performanceScore = performanceScore;
	}

	public double getPerformanceScore() {
		return performanceScore;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	@Override
	public String toString() {
		return "RegularEmployee [performanceScore=" + performanceScore + ", bonus=" + bonus + "]";
	}

}
