package main.blogic;

public class Printer {
	
	public void print (Employee e, int grade) {
		System.out.println( "Name: " + e.printFullName());
		System.out.println( "Grade: " + e.printGrade(grade));
		System.out.println( "Net Salary: " + e.calculateNetSalary());
	}

}
