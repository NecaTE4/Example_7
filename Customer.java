//Name: Necati
//Surname: Koçak
//Student ID: 150120053

import java.util.ArrayList;
import java.util.Calendar;

public class Customer extends Person {

	private ArrayList<Product> products = new ArrayList<Product>();

	public Customer(int id, String firstName, String lastName, String gender, Calendar birthDate, String maritalStatus,
			String hasDriverLicence, ArrayList<Product> products) {
		super(id, firstName, lastName, gender, birthDate, maritalStatus, hasDriverLicence);

	}

	public Customer(Person person, ArrayList<Product> products) {
		super(person.getId(), person.getFirstName(), person.getLastName(), person.getGender(), person.getBirthDate(),
				person.getMaritalStatus(), person.getHasDriverLicence());
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	@Override
	public String toString() {
		return "Customer [products=" + products + "]";
	}

}
