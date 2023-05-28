//Name: Necati
//Surname: Koçak
//Student ID: 150120053

import java.util.Calendar;

public class Employee extends Person {
	private double salary;
	private Calendar hireDate;
	private Department department;
	public int numberofEmployees;

	public Employee(int id, String firstName, String lastName, String gender, Calendar birthDate, String maritalStatus,
			String hasDriverLicence, double salary, Calendar hireDate, Department department) {
		super(id, firstName, lastName, gender, birthDate, maritalStatus, hasDriverLicence);
		numberofEmployees++;
	}

	public Employee(Person person, double salary, Calendar hireDate, Department department) {
		super(person.getId(), person.getFirstName(), person.getLastName(), person.getGender(), person.getBirthDate(),
				person.getMaritalStatus(), person.getHasDriverLicence());
		numberofEmployees++;
	}

	public double raiseSalary(double percent) {
		if (percent >= 0 && percent <= 1) {
			return this.salary += percent * this.salary;
		} else {
			throw new IllegalArgumentException("Wrong Argument");
		}
	}

	public double raiseSalary(int amount) {
		return this.salary += amount;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setHireDate(Calendar hireDate) {
		this.hireDate = hireDate;
	}

	public Calendar getHireDate() {
		return hireDate;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Department getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", hireDate=" + hireDate + ", department=" + department
				+ ", numberofEmployees=" + numberofEmployees + "]";
	}

}
