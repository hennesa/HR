package main.view;

import main.blogic.Employee;
import main.blogic.Printer;

public class Exceute {

	public static void main(String[] args) {
		//declaration
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Printer p = new Printer();
		//data entry
		e1.fName = "Mohamed";
		e1.sName = "Osama";
		e1.gender = "M";
		e1.age = 34;
		e1.salary = 100000;
		
		e2.fName = "Heba";
		e2.sName = "Wagdi";
		e2.gender = "F";
		e2.age = 24;
		e2.salary = 25000;
		
		e3.fName = "Ali";
		e3.sName = "Nader";
		e3.gender = "M";
		e3.age = 27;
		e3.salary = 10000;
		//printing
		p.print(e1, 5);
		System.out.println("------------------------------");
		p.print(e2, 3);
		System.out.println("------------------------------");
		p.print(e3, 1);
		System.out.println("------------------------------");
	}

}
