//Name: Necati
//Surname: Koçak
//Student ID: 150120053

import java.util.Calendar;

public class Person {

	private int id;
	private String firstName;
	private String lastName;
	private byte gender;
	private Calendar birthDate;
	private byte maritalStatus;
	private boolean hasDriverLicence;

	public Person(int id, String firstName, String lastName, String gender, Calendar birthDate, String maritalStatus,
			String hasDriverLicence) {

	}
	public Person() {

	}

	public void setGender(String gender) {
		if (gender.equals("Woman")) {
			this.gender = 1;
		} else if (gender.equals("Man")) {
			this.gender = 2;
		} else {
			throw new IllegalArgumentException("Wrong Argument");
		}
	}

	public String getGender() {
		if (this.gender == 1) {
			return "Woman";
		} else {
			return "Man";
		}
	}

	public void setMaritalStatus(String status) {
		if (status.equals("Single")) {
			this.maritalStatus = 1;
		} else if (status.equals("Married")) {
			this.maritalStatus = 2;
		} else {
			throw new IllegalArgumentException("Wrong Argument");
		}
	}

	public String getMaritalStatus() {
		if (this.maritalStatus == 1) {
			return "Single";
		} else {
			return "Married";
		}
	}

	public void setHasDriverLicence(String info) {
		if (info.equals("Yes")) {
			this.hasDriverLicence = true;
		} else if (info.equals("No")) {
			this.hasDriverLicence = false;
		} else {
			throw new IllegalArgumentException("Wrong Argument");
		}
	}

	public String getHasDriverLicence() {
		if (this.hasDriverLicence == true) {
			return "Yes";
		} else {
			return "No";
		}

	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setBirthDate(Calendar birthDate) {
		this.birthDate = birthDate;
	}

	public Calendar getBirthDate() {
		return birthDate;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", birthDate=" + birthDate + ", maritalStatus=" + maritalStatus + ", hasDriverLicence="
				+ hasDriverLicence + "]";
	}

}
