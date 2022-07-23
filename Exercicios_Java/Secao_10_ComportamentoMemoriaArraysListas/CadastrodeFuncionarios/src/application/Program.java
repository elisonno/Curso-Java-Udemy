package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idIncrease;
		System.out.println("How many employees will be registered?");
		int employee = sc.nextInt();
		
		List<Employee> listEmployee = new ArrayList<>();
		
		for(int i = 0; i<employee; i++) {
			Integer id;
			String name;
			Double salary;
			System.out.println("What is id of employee?");
			id = sc.nextInt();
			sc.nextLine();
			System.out.println("What is name of employee?");
			name = sc.nextLine();
			System.out.println("What is salary of employee?");
			salary = sc.nextDouble();
			listEmployee.add(new Employee(id, name, salary));
						
		}
		for (Employee x : listEmployee) {
			System.out.println(x);
		}
		
		System.out.println("Enter the employee id that will have salary increase:");
		idIncrease = sc.nextInt();
		Employee emp = listEmployee.stream().filter(x -> x.getId() == idIncrease).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage of increase:");
			emp.salaryIncrease(sc.nextDouble());
		}
		
		System.out.println("List of Employee");
		for (Employee x : listEmployee) {
			System.out.println(x);
		}
		
		
		
		
		sc.close();

	}

}
