package main.blogic;

public class Printer {

	public void print(Employee[] e) {

		for (int i = 0; i < e.length; i++) {
			System.out.println("Name: " + e[i].printFullName());
			System.out.println("Grade: " + e[i].printGrade(e[i].grade));
			System.out.println("Net Salary: " + e[i].calculateNetSalary());
			System.out.println("------------------------------");
		}
	}

}
