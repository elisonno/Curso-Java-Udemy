package Exercicio_2;

public class Employee {
	String name;
	double grossSalary;
	double tax;
	
	public double NetSalary() {
		return grossSalary - tax;
	}
	public void IncreaseSalary(double percentage) {
		grossSalary += grossSalary*(percentage/100);
	}
	
	public String toString() {
		return "Name: " + name + "\nGross Salary: " + String.format("%.2f", grossSalary)
				+ "\nTax: " + String.format("%.2f", tax);
				
	}

}
