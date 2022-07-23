package Exercicio_2;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		/*Fazer um programa para ler os dados de um funcionário (nome, salário bruto e
		 imposto). Em seguida, mostrar os dados do funcionário (nome e salário
		 líquido). Em seguida, aumentar o salário do funcionário com base em uma
		 porcentagem dada (somente o salário bruto é afetado pela porcentagem) e
		 mostrar novamente os dados do funcionário. Use a classe projetada abaixo.
		  	 Employee 
		 --------------------
		 - Name: string
		 - GrossSalary: double
		 - Tax: double 
		 --------------------
		 - NetSalary(): double
		 - IncreaseSalary(percentage: double): void	 */
		Scanner sc = new Scanner(System.in);
		Employee employee_1 = new Employee();
		System.out.println("Enter name employee");
		employee_1.name = sc.nextLine();
		System.out.println("Enter gross salary employee");
		employee_1.grossSalary = sc.nextDouble();
		System.out.println("Enter tax");
		employee_1.tax = sc.nextDouble();
		System.out.println(employee_1);
		System.out.println("Employee: "+ employee_1.name +", $ " + String.format("%.2f", employee_1.NetSalary()));
		System.out.println("Which percentage to increase salary?");
		employee_1.IncreaseSalary(sc.nextDouble());
		System.out.println("Updated date: "+ employee_1.name +", $ " + String.format("%.2f", employee_1.NetSalary()));
		
		sc.close();
		

	}

}
