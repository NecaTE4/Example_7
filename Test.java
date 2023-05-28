
//Name: Necati
//Surname: Koçak
//Student ID: 150120053

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("input");

		Scanner input = new Scanner(file);
		ArrayList<String> satirlar = new ArrayList<String>();
		while (input.hasNextLine()) {
			satirlar.add(input.nextLine());
		}

		ArrayList<Object> dizi = new ArrayList<Object>();
		ArrayList<Person> personlar = new ArrayList<Person>();
		ArrayList<Project> projects = new ArrayList<Project>();

		for (int i = 0; i < satirlar.size(); i++) {
			String[] satir = satirlar.get(i).split(" ");
			if (satir[0].equals("Departman")) {
				Department acc1 = new Department(Integer.parseInt(satir[1]), satir[2]);
				dizi.add(acc1);
			} else if (satir[0].equals("Project")) {
				Calendar calendar;
				try {
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					String dateInString = satir[2];
					Date date = sdf.parse(dateInString);

					calendar = Calendar.getInstance();
					calendar.setTime(date);
				} catch (Exception e) {
					calendar = new GregorianCalendar(1, 1, 1);

				}
				Project autocredit = new Project(satir[1], calendar, satir[3]);
				dizi.add(autocredit);
			} else if (satir[0].equals("Person")) {
				Calendar calendar;
				try {
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					String dateInString = satir[5];
					Date date = sdf.parse(dateInString);

					calendar = Calendar.getInstance();
					calendar.setTime(date);
				} catch (Exception e) {
					calendar = new GregorianCalendar(1, 1, 1);

				}
				Person per1 = new Person(Integer.parseInt(satir[3]), satir[1], satir[2], satir[4], calendar, satir[6],
						satir[7]);
				dizi.add(per1);
			} else if (satir[0].equals("Employee")) {
				Calendar calendar;
				try {
					SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
					String dateInString = satir[5];
					Date date = sdf.parse(dateInString);

					calendar = Calendar.getInstance();
					calendar.setTime(date);
				} catch (Exception e) {
					calendar = new GregorianCalendar(1, 1, 1);
				}
				for (int j = 0; j < dizi.size(); j++) {
					if (dizi.get(j) instanceof Person) {

						if (((Person) dizi.get(j)).getId() == 111) {
							for (int x = 0; i < dizi.size(); i++) {
								if (dizi.get(x) instanceof Department) {
									if (((Department) dizi.get(x)).getDepartmentName() == "Accounting") {
										Employee emp1 = new Employee((Person) dizi.get(j), 5000,
												new GregorianCalendar(2017, 10, 10), (Department) dizi.get(x));
										
									}
								}
							}

						}

					}
				}

			}

		}

	}

}
