//Name: Necati
//Surname: Koçak
//Student ID: 150120053

import java.util.ArrayList;
import java.util.Calendar;

public class Manager extends Employee {

	private ArrayList<RegularEmployee> regularEmployees = new ArrayList<RegularEmployee>();

	private double bonusBudget;

	public Manager(int id, String firstName, String lastName, String gender, Calendar birthDate, String maritalStatus,
			String hasDriverLicence, double salary, Calendar hireDate, Department department, double bonusBudget) {
		super(id, firstName, lastName, gender, birthDate, maritalStatus, hasDriverLicence, salary, hireDate,
				department);
	}

	public Manager(Employee employee, double bonusBudget) {
		super(employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getGender(),
				employee.getBirthDate(), employee.getMaritalStatus(), employee.getHasDriverLicence(),
				employee.getSalary(), employee.getHireDate(), employee.getDepartment());
	}

	public void addEmployee(RegularEmployee e) {
		regularEmployees.add(e);
	}

	public void removeEmployee(RegularEmployee e) {
		regularEmployees.remove(e);
	}

	public void distributeBonusBudget() {
		bonusBudget = 10000;
		double unit = 0;
		double[] bonus = new double[regularEmployees.size()];
		int sum = 0;
        for(int i = 0; i < regularEmployees.size(); i++) {
           sum +=regularEmployees.get(i).getPerformanceScore()*regularEmployees.get(i).getSalary();
        }
        unit=(double)bonusBudget/sum;
		for (int i = 0; i < regularEmployees.size(); i++) {
			bonus[i] = unit*regularEmployees.get(i).getSalary()*regularEmployees.get(i).getPerformanceScore();
		}
	}

	public void setRegularEmployees(ArrayList<RegularEmployee> regularEmployees) {
		this.regularEmployees = regularEmployees;
	}

	public ArrayList<RegularEmployee> getRegularEmployees() {
		return regularEmployees;
	}

	public void setBonusBudget(double bonusBudget) {

		this.bonusBudget = bonusBudget;

	}

	public double getBonusBudget() {
		return bonusBudget;
	}

	@Override
	public String toString() {
		return "Manager [regularEmployees=" + regularEmployees + ", bonusBudget=" + bonusBudget + "]";
	}

}
