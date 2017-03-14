package main.blogic;

public class Employee {
	public String fName;
	public String sName;
	public int age;
	public double salary;
	public String gender;
	public int grade;
	
	public String printFullName () {
		if (gender.equalsIgnoreCase("m")) {
			return "Mr. " + fName + ' ' + sName;
		} else if (gender.equalsIgnoreCase("f")) {
			return "Ms. " + fName + ' ' + sName;
		}
		return "data error, unknown gender";
	}
	
	public String printGrade ( int grade) {
		String stars = "";
		
		for (int i=0; i< grade; i++) {
			stars = stars + '*';
		}
		
		return stars;
	}
	
	public double calculateNetSalary () {
		if (salary <= 10000) {
			return salary;
		} else if (salary <= 20000 ) {
			return salary * 0.95;
		} else if (salary <= 30000) {
			return salary * 0.9;
		} 
		return salary * 0.8;
	}

}
