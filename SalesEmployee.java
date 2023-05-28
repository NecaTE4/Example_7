//Name: Necati
//Surname: Ko�ak
//Student ID: 150120053

import java.util.ArrayList;
import java.util.Calendar;

public class SalesEmployee extends RegularEmployee {
	private ArrayList<Product> sales = new ArrayList<Product>();
	public static int numberOfSalesEmployees;

	public SalesEmployee(int id, String firstName, String lastName, String gender, Calendar birthDate,
			String maritalStatus, String hasDriverLicence, double salary, Calendar hireDate, Department department,
			double performanceScore, ArrayList<Product> s) {
		super(id, firstName, lastName, gender, birthDate, maritalStatus, hasDriverLicence, salary, hireDate, department,
				performanceScore);
		numberOfSalesEmployees++;
	}

	public SalesEmployee(RegularEmployee re, ArrayList<Product> s) {
		super(re.getId(), re.getFirstName(), re.getLastName(), re.getGender(), re.getBirthDate(), re.getMaritalStatus(),
				re.getHasDriverLicence(), re.getSalary(), re.getHireDate(), re.getDepartment(),
				re.getPerformanceScore());
		numberOfSalesEmployees++;

	}

	public boolean addSale(Product s) {
		return sales.add(s);
	}

	public boolean removeSale(Product s) {
		return sales.remove(s);
	}

	public void setSales(ArrayList<Product> sales) {
		this.sales = sales;
	}

	public ArrayList<Product> getSales() {
		return sales;
	}

	public static void setNumberOfSalesEmployees(int numberOfSalesEmployees) {
		SalesEmployee.numberOfSalesEmployees = numberOfSalesEmployees;
	}

	public static int getNumberOfSalesEmployees() {
		return numberOfSalesEmployees;
	}

	@Override
	public String toString() {
		return "SalesEmployee [sales=" + sales + "]";
	}

}
