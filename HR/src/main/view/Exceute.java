package main.view;

import main.blogic.Employee;
import main.blogic.Printer;

public class Exceute {

	public static void main(String[] args) {
		//declaration
		Employee[] e = new Employee[3];
		// initialization
		for(int i=0; i< e.length; i++) {
			e[i] = new Employee();
		}
		Printer p = new Printer();
		//data entry
		e[0].fName = "Mohamed";
		e[0].sName = "Osama";
		e[0].gender = "M";
		e[0].age = 34;
		e[0].salary = 100000;
		e[0].grade = 5;
		
		e[1].fName = "Heba";
		e[1].sName = "Wagdi";
		e[1].gender = "F";
		e[1].age = 24;
		e[1].salary = 25000;
		e[1].grade = 3;
		
		e[2].fName = "Ali";
		e[2].sName = "Nader";
		e[2].gender = "M";
		e[2].age = 27;
		e[2].salary = 10000;
		e[2].grade = 1;
		
		//printing
		p.print(e);
		
	}

}
